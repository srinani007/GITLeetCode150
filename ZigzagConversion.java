public class ZigzagConversion {
    public String convet(String s, int numRows){
        if(numRows == 1 || s.length() <= numRows) return s; // no Zigzag needed

        StringBuilder[] rows = new StringBuilder[numRows]; //step1 : create rows

        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder(); // Initialize each row
        }
        int i =0, direction = -1; // state from row 0, direction is initally -1
        for(char c : s.toCharArray()){
            rows[i].append(c); // place character in current row

            //change direction at the top and bottom
            if(i == 0 || i == numRows - 1) direction *= -1;

            i += direction; // Move up or down
        }

        //combine all rows to get the finaL ZIG ZAG string
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
    
}