import java.util.ArrayList;
import java.util.List;

public class MatrixSprial {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();

        if(matrix.length == 0) return res;

        int columnStart = 0;
        int rowStart = 0;
        int rowEnd  = matrix.length - 1;
        int columnEnd  = matrix[0].length - 1;

        while(columnStart <= columnEnd && rowStart <= rowEnd){

            // column starting to column ending
            for (int i = columnStart; i <= columnEnd; i++){
                res.add(matrix[rowStart][i]);
            }
            rowStart++;

            // row starting to row ending
            for (int i = rowStart; i <= rowEnd; i++){
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            //check if the row start < = row end
            if (rowStart <= rowEnd){
                for (int i = columnEnd; i >= columnStart; i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // check if the column start <= column end
            if (columnStart <= columnEnd){
                for (int i = rowEnd; i >= rowStart; i--){
                    res.add(matrix[i][columnStart]);
                }
            }
            columnStart++;
        }
        return res;
    }
}
