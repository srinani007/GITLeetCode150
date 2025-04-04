
public class NinetyDegree {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // check the first row for zeroes
        for (int j = 0; j < m; j++)
            if (matrix[0][j] == 0) { // check the j mean the first row for zeroes
                // if any element in the first row is zero, we need to set the entire first row
                // to zero
                firstRowHasZero = true;
                break;
            }

        // check the first column for zeroes
        for (int i = 0; i < n; i++)
            if (matrix[i][0] == 0) {
                // if any element in the first column is zero, we need to set the entire first
                // column to zero
                // this is important because we will use the first row and column to mark zeroes
                // in the rest of the matrix
                firstColHasZero = true;
                break;
            }

        // use the first row and column to mark zeroes in the rest of the matric
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) { // if we find a zero in the matrix
                    // we mark the first row and column of the corresponding row and column
                    // this is done to avoid using extra space for another matrix
                    // we will use the first row and column as markers
                    // for example, if we find a zero at matrix[2][3], we will mark
                    // matrix[2][0] and matrix[0][3] as zero
                    // this way, we can remember which rows and columns need to be set to zero
                    // later, we will iterate through the first row and column to set the
                    // corresponding rows and columns to zero
                    // we start from 1 to avoid the first row and column
                    matrix[i][0] = 0; // mark the first column of the row
                    matrix[0][j] = 0; // mark the first row of the column
                }
            }
        }
        // set matrix elements to zero based on the marks in the first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) { // start from 1 to avoid the first row and column
                // if the first row or column has a zero, we need to set the current element to
                // zero
                // this is because we have marked the rows and columns that need to be set to
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0; // set the element to zero if its row or column is marked
                }
            }
        }
        // set the first row to zero if needed
        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) { // iterate through the entire first row
                // we need to set the entire first row to zero if it has any zeroes
                // this is important because we are using the first row to mark zeroes in the
                matrix[0][j] = 0; // set the entire first row to zero
            }
        }
        // set the first column to zero if needed
        if (firstColHasZero) {
            for (int i = 0; i < n; i++) { // iterate through the entire first column
                // we need to set the entire first column to zero if it has any zeroes
                matrix[i][0] = 0; // set the entire first column to zero
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 0, 7, 8 },
                { 9, 10, 11, 12 },
                // {13, 14, 15, 16}, // Uncomment this line to test with a 4x4 matrix
                { 17, 18, 19, 20 },
                { 19, 10, 0, 12 }

        };
        System.out.println("Original matrix:");
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

    }
}
