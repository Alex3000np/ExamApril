package Normal1.TrickyAverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrickyAverageTest {

    @Test
    void getTrickyAvg() {
        int[] testArray = new int[]{3, 4, 5, 6};
        double expected = 4.5;
        double actual = TrickyAverage.getTrickyAvg(testArray);
        assertEquals(expected, actual);
    }

    @Test
    void getTrickyAvgTestNoOdds() {
        int[] testArray2 = new int[]{2, 4, 8, 6};
        double expected = 4;
        double actual = TrickyAverage.getTrickyAvg(testArray2);
        assertEquals(expected, actual);
    }
}