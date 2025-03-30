
// LeetCode 68. Text Justification
// https://leetcode.com/problems/text-justification/
// Given an array of strings words and a maxWidth, return a list of strings where each string is fully justified.
// A line is fully justified if it meets the following conditions:
// 1. Each line has exactly maxWidth characters.
import java.util.ArrayList;
import java.util.List;

public class fullyJustify {
    public List<String> fullyList(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();
        int index = 0; // start from the first word
        // iterate through the words until we reach the end of the array
        // for each word, we will try to fit as many words as possible in the current line
        // while ensuring that the total length of the line does not exceed maxWidth
        // we will also keep track of the number of words in the current line 

        while (index < words.length) { // check if we have receached the end of the array
            // count the length of the current line and the number of words in it
            int count = words[index].length(); // initialize count to the length of the first word in the current line
            // initialize last to the current index
            // last will be used to keep track of the last word that fits in the current line
            // we will also use it to determine the number of words in the current line and the numnbr of spaces to be added between the words
            int last = index; // initialize last to the current index

            // Fit as many words as possible in the current line
            // we will do this by checking if the next word can fit in the current line
            // if it can fit, we will add it to the line and update the count to include the length of the next word
            // and the space between the current word and the next word
            // we will also update last to point to the next word
            // we will do this until we reach the end of the array or the next word cannot fit in the current line
            while ((last + 1) < words.length && count + 1 + words[last + 1].length() <= maxWidth) {
                // if the next word can fit in the current line we will add it to the line
                // we will also update the count to include the length of the next word 
                // and the space between the current word and the next word
                // we will also update last to point to the next word 
                count += 1 + words[last + 1].length(); // add the length of the next word and the space between the current word and the next word
                // update last to point to the next word
                // this will ensure that last points to the last word that fits in the current line
                last++; // update last to point to next word
            }

            // now we have the last word that fits in the current line and the total length of the line
            // we will now create a string builder to build the current line
            // we will also calculate the number of words in the current line and the number of spaces to be added between the words
            // we will also check if the current line is the last line or if the current line has only one word
            // if so we will left justify the line
            // otherwise we will fully justify the line
            StringBuilder builder = new StringBuilder(); // create a string builder to build the current line
            // calculate the number of words in the current line
            // we will do this by subtracting the index from last and adding one
            int numWords = last - index + 1; // total number of words in the current line
            // calculate the number of spaces to be added between the words
            // we will do this by subtracting the total length of the line from maxwidth
            // amd addoing the number of words in the current line minus one
            // this will give us the total number of spaces to be added between the words
            int numSpaces = maxWidth - count + (numWords - 1);

            // Left justify if it's the last line or only one word fits
            if (last == words.length - 1 || numWords == 1) { // check if we are at the last line or if only we have word that fits in the current line
                // If it's the last line or only one word, we left justify
                for (int i = index; i <= last; i++) { // add the words to the line
                    builder.append(words[i]); // add the current word to the line
                    if (i < last) // add a space between the words
                        builder.append(" ");
                }
                // Add spaces to the end of the line to reach madWidth
                // This is done to ensure that the line has exactly maxWidth characters
                // by appending spaces to the end of the line
                // until the length of the line is equal to maxWidth
                // we will keep appending spaces until the length of the line is equal to maxWidth
                
                while (builder.length() < maxWidth)
                    builder.append(" ");
            } else {
                // Fully justify the text
                int spacesSlots = numWords - 1;
                int spaces = numSpaces / spacesSlots;
                int extraSpaces = numSpaces % spacesSlots;

                // Distribute spaces between words

                for (int i = index; i <= last; i++) {
                    builder.append(words[i]);
                    if (i < last) {
                        int spaceToApply = spaces + (i - index < extraSpaces ? 1 : 0);
                        for (int j = 0; j < spaceToApply; j++)
                            builder.append(" ");
                    }
                }
            }
            // Add the fully justified line to the list of lines
            // we will convert the string builder to a string and add it to the list of lines
            // we will also update index to point to the next word that needs to be added to the next line
            // we will do this by setting index to last + 1
            // this will ensure that the next line starts from the next word after the last word that was added to the current line

            lines.add(builder.toString());
            index = last + 1;
        }
        // return the list of lines
        // this will ensure that the list of lines contains all the fully justified lines
        // that were created from the words in the array
        // we will also ensure that the list of lines is returned to the caller
        // so that it can be used to display the fully justified text
        // to the user
  

        return lines;
    }

    public static void main(String[] args) {
        fullyJustify obj = new fullyJustify();
        String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
        int maxWidth = 16;
        List<String> result = obj.fullyList(words, maxWidth);
        for (String line : result) {
            System.out.println(line);
        }
    }
}
