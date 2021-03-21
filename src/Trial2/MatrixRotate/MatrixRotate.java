package Trial2.MatrixRotate;

public class MatrixRotate {
    public static void main(String[] args) {
        int[][] originalMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] i : rotateMatrix(originalMatrix))
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] inputMatrix) {
        int[][] fixedMatrix = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int cellValue;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                cellValue = inputMatrix[i][j];
                fixedMatrix[j][inputMatrix.length - i - 1]=cellValue;
            }
        }
        return fixedMatrix;
    }
}

