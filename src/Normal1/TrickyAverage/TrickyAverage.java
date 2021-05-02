package Normal1.TrickyAverage;

public class TrickyAverage {
    public static double getTrickyAvg(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > maxEven) {
                maxEven = arr[i];
            } else if (arr[i] % 2 != 0 && arr[i] < minOdd) {
                minOdd = arr[i];
            }
        }
        if (maxEven == Integer.MIN_VALUE) {
            maxEven = 0;
        }
        if (minOdd == Integer.MAX_VALUE) {
            minOdd = 0;
        }
        return (maxEven + minOdd) / 2.0; //double
    }
}
