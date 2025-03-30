public class VaildSudoku {
    public boolean isValidSudoku(char[][] board) {
        // create a new boolean array to store the values of the rows, columns, and boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        // iterate through the board
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                // check if the current cell is not empty
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1'; // get the value of the cell
                    int boxIndex = (i / 3) * 3 + j / 3; // get the index of the box
                    
                    // check if the value is already present in the row, column, or box
                    if(rows[i][num] || cols[j][num] || boxes[boxIndex][num]){
                        return false;
                    }
                    
                    // mark the value as present in the row, column, and box
                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[boxIndex][num] = true;
                }
            }
        }
        return true; // return true if the board is valid
    }
    public static void main(String[] args) {
        VaildSudoku obj = new VaildSudoku();
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(obj.isValidSudoku(board)); // true
    }
}
