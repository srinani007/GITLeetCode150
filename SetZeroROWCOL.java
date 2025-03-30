public class SetZeroROWCOL {
    public int[][] setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int temp = matrix[i][j];
                while (matrix[i][j] == 0){
                    matrix[i][j] = 0;
                    matrix[i][j]++;
                }
            }
        }
        return matrix;
    }
}
