public class GameOfLife {
    public void gameOf(int[][] board){
        int m = board.length, n = board[0].length;
        int[] direction = {-1, 0, 1}; // used for navigating neighbors

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int liveNeighbors = 0;

                for(int x : direction){
                    for (int y : direction){
                        if (x == 0 && y == 0) continue;
                        int ni = i + x, nj = j + y;

                        if (ni >= 0 && ni < m && nj >= 0 && nj < n && Math.abs(board[ni][nj]) == 1){
                            liveNeighbors++;
                        }
                    }
                }

                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)){
                    board[i][j] = -1;
                }
                if (board[i][j] ==0 && liveNeighbors == 3){
                    board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == -1) board[i][j] = 0;
                if (board[i][j] == 2) board[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        GameOfLife gm = new GameOfLife();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        System.out.println("Before:");
        printBoard(board);

        gm.gameOf(board);

        System.out.println("\nAfter:");
        printBoard(board);


    }
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(STR."\{cell} ");
            }
            System.out.println();
        }
    }
}
