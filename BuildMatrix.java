public class BuildMatrix {
    public static int[][] buildMatrix(int n) {
        int[][] matrix = new int[n][n]; // Create an n * n matrix
        int num = 1; // Start with 1

        // Step 1: Fill the matrix with numbers from 1 to n^2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = num++; // Assign the current number and increment it
            }
        }

        // Step 2: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // Only swap the upper triangle
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 3: Reverse each row (swap left and right elements)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) { // Swap elements symmetrically
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        return matrix; // Return the rotated matrix
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        int[][] matrix = buildMatrix(n); // Build the matrix and rotate it

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element in the matrix
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
