
import java.util.ArrayList;
import java.util.List;

public class FullyJustfield{
    public List<String> fullyJustify(String[] words, int maxWidth){
        
        List<String> result = new ArrayList<>(); // create a list to store the justified lines

        int i = 0, n = words.length; // initialize i to 0 and n to the length of words

        while (i < n ){
            int j = i + 1; // initialize j to i + 1
            int lineLength = words[i].length(); // initialize lineLength to the length of the first word in the current line
            // Fit as many words as possible in the current line

            while (j < n && (lineLength + words[j].length() + (j - i)) <= maxWidth) {
                lineLength += words[j].length(); // add the length of the next word to lineLength
                ++j; // increment j to point to the next word
            }


            int diff = maxWidth - lineLength; // calculate the difference between maxWidth and lineLength
            int numberOfWords = j - i; // calculate the number of words in the current line 


            if(numberOfWords == 1 || j >= n) {
                result.add(leftJustify(words, diff, i, j));
            } else {
                result.add(middleJustify(words, diff, i, j));
            }
            i = j; // update  i to point to next word after the current line
        }
        return result; // return the list of justified lines
    }
    // method to middle justify the current line
    public String middleJustify(String[] words, int diff, int i, int j){
        int spacesNeeded = j - i - 1; // calculate the number of spaces needed between the words
        int spaces = diff / spacesNeeded;  // calculate the number 
        int extraSpaces = diff % spacesNeeded; // calculate the number of extra spaces to be added

        StringBuilder result = new StringBuilder(words[i]);
         // create a string builder to build the current line

        for(int k = i + 1; k < j; ++k){
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);// calculate the number of spaces to be added between the current word and the next word
            result.append(" ".repeat(spacesToApply) + words[k]); // add the spaces and the current word to the line
        }

        return  result.toString(); // return the current line as a string
    }

    private String leftJustify(String[] words, int diff, int i, int j){
        StringBuilder result = new StringBuilder(words[i]); // create a string builder to build the current line

        int spacesUsed = 0;
        for(int k = i + 1; k < j; k++){
            result.append(" ").append(words[k]);
            spacesUsed++;
        }
        int remain = diff - spacesUsed;
        result.append(" ".repeat(remain)); // add the spaces on the right

        return result.toString(); // return the current line as a string
    }
    public static void main(String[] args) {
        FullyJustfield obj = new FullyJustfield();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = obj.fullyJustify(words, maxWidth);
        for (String line : result) {
            System.out.println(line);
        }
    }
}
