package RetakeMaggie.MatrixTranspose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest {
//original method right click > genearate> test > tick method to be tested
    @Test
    void transposeMatrix() {
        int[][] testArr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] exp = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
        };
        int [][] act = MatrixTranspose.transposeMatrix(testArr);
        assertArrayEquals(exp,act);
    }
    @Test
    void transposeMatrix2() {
        int[][] testArr = new int[][]{
                {5, 9, 3, 7},
                {3, 2, 1, 8},
        };
        int[][] exp = new int[][]{
                {5, 3},
                {9, 2},
                {3, 1},
                {7, 8},
        };
        int [][] act = MatrixTranspose.transposeMatrix(testArr);
        assertArrayEquals(exp,act);
    }
}