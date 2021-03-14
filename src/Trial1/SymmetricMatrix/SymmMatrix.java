package Trial1.SymmetricMatrix;

public class SymmMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };
        System.out.println(isSymmetric(matrix));
    }

    public static boolean isSymmetric(int[][] userMatrix) {
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                if (userMatrix[i][j] != userMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
