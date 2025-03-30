
import java.util.ArrayList;
import java.util.List;

public class FullyJustfieldTest{
    public List<String> fullyJustify(String[] words, int maxWidth){
        List<String> result = new ArrayList<>();

        int i = 0, n = words.length;

        while(i < n){
            int j = i + 1;
            int lineLength = words[i].length();

            while(j < n && (lineLength + words[j].length() + (j - i)) <= maxWidth){
                lineLength += words[j].length(); 
                ++j;
            }
            int diff = maxWidth - lineLength;
            int numberOfwords = j - i;
            if(numberOfwords == 1 || j >= n) result.add(leftJustify(words, diff, i, j));
            else result.add(middleJustify(words, diff, i , j));

            i = j; // update i to point to next 
        }
        return result;
    }

    public String middleJustify(String[] words, int diff, int i, int j){
        int spacesNeeded = j - i - 1;
        int spaces = diff / spacesNeeded;
        int extraSpaces = diff % spacesNeeded;
        if (spacesNeeded == 0) return leftJustify(words, diff, i, j); 


        StringBuilder result = new StringBuilder(words[i]);
        if (spacesNeeded == 0) return leftJustify(words, diff, i, j);

        for(int k = i + 1; k < j; ++k){
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacesToApply) + words[k]);
        }
        return result.toString();
    }

    public String leftJustify(String[] words, int diff, int i, int j){
        StringBuilder result = new StringBuilder(words[i]);

        int spacesOnRight = diff;
        for(int k = i; k < j; k++){
            result.append(" " + words[k]);
        }
        result.append(" ".repeat(Math.max(0, spacesOnRight)));

        return result.toString();
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
