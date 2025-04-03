public class DMatrix {
    public static  void  rowWiseTraversal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {  // Loop through rows
            for (int j = 0; j < matrix[0].length; j++) {  // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next row
        }
    }
    public static void columnWiseTraversal(int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++){
            for (int[] ints : matrix) {
                System.out.print(STR."\{ints[j]} ");
            }
            System.out.println();
        }
    }
    public static void diagonalTraversal(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.print(STR."\{matrix[i][i]} ");
        }
        System.out.println();
    }
    public static int subMatrix(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static boolean searchBruteForce(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target){
                    return true; // target found
                }
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int row = 0, col = matrix[0].length - 1; // start at top-right
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target) return true; // found
            else if (matrix[row][col] < target) row++; // move down
            else col--; // move left
        }
        return false;// not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 9, 12}
        };
        int target = 9;
        System.out.println(STR."found: \{searchMatrix(matrix, target)}");
        System.out.println();
        //System.out.println(STR."col-wise Traversal:\{subMatrix(matrix)}");

    }
}
