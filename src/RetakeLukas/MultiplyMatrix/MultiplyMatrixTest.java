package RetakeLukas.MultiplyMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyMatrixTest {

    @Test
    void multiplyMX() {
        Integer[][] testArr = {
                {2, 3},
                {5, 0, 4, 0},
                {6},
                {5, 2}
        };
        Integer[][] expectedArr = {
                {4,  3},
                {10, 0, 4, 0},
                {12},
                {10, 2}
        };
        assertArrayEquals(expectedArr, MultiplyMatrix.multiplyMX(testArr)); //(expected, class.method(testArr));
    }
}