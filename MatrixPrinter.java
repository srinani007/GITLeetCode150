public class MatrixPrinter {
    public static void printMatrix(int[][] matrix, int target) {
        // Check for null or empty matrix
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty or null matrix");
            return;
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || matrix[i].length == 0) {
                System.out.println(STR."Row \{i}: empty");
                continue;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(STR."\{matrix[i][j]} ");
            }
            System.out.println();
        }

        // Search for the target and report all occurrences
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) continue; // Skip null rows
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    System.out.println(STR."Target \{target} found at row \{i}, column \{j}");
                }
            }
        }
        if (!found) {
            System.out.println(STR."Target \{target} not found in the matrix");
        }
    }

    public static void main(String[] args) {
        // Example matrix (rectangular)
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 0, 7, 8 },
                { 9, 10, 11, 12 },
                { 17, 18, 19, 20 },
                { 19, 10, 0, 12 }
        };
        int target = 0; // Example target value
        printMatrix(matrix, target);

        // Test with a jagged matrix
        System.out.println("\nTesting jagged matrix:");
        int[][] jaggedMatrix = {
                { 1, 2, 3 },
                { 4, 0 },
                { 7, 8, 9, 10 }
        };
        printMatrix(jaggedMatrix, target);
    }
}