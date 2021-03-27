package RetakeMaggie.MatrixTranspose;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] userMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        transposeMatrix(userMatrix);
    }
//rows =  matrix.length;
// columns =  matrix[0].length

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        //now we have new matrix, lets print:
        for (int x = 0; x < newMatrix.length; x++) {
            for (int y = 0; y < newMatrix[0].length; y++) {
                System.out.print(newMatrix[x][y]);
            }
            System.out.println();
        }
        return newMatrix;
    }
}
