public class Floodfill {

    int[] directions = {-1, 0, 1, 0 , -1};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){

        int m = image.length, n = image[0].length;
        int oldColor = image[sr][sc];

        if (oldColor == newColor) return image;

        dfs(image, sr, sc, oldColor, newColor, m, n);
        return image;

    }

    private void dfs(int[][] image, int x, int y, int oldColor, int newColor, int m, int n){

        if (x < 0 || x >= m || y < 0 || y >= n || image[x][y] != oldColor ) return;

        image[x][y] = newColor;

        for (int i = 0; i < 4; i++){
            int newX = x + directions[i];
            int newY = y + directions[i + 1];
            dfs(image, newX, newY, oldColor, newColor, m, n);
        }
    }

    public static void main(String[] args) {
        Floodfill fd = new Floodfill();
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        System.out.println("Before ");
        printImage(image);

        fd.floodFill(image, sr, sc, newColor);

        System.out.println("After: " );
        printImage(image);

    }
    private static void printImage(int[][] image){
        for(int[] row : image){
            for (int cell : row){
                System.out.print(STR."\{cell} ");
            }
            System.out.println();
        }
    }
}
