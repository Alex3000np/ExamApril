package RetakeLukas.MultiplyMatrix;

import java.beans.IntrospectionException;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Integer[][] userMatrix = {
                {2, 3},
                {5, 0, 4, 0},
                {6},
                {5, 2}
        };
        Integer[][] fixedMX = multiplyMX(userMatrix);
        for (int i = 0; i < fixedMX.length; i++) {              //printing with double for loop
            for (int j = 0; j < fixedMX[i].length; j++) {
                System.out.print(fixedMX[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static Integer[][] multiplyMX(Integer[][] mx) {
        for (int i = 0; i < mx.length; i++) {               //mx.length column length
            for (int j = 0; j < mx[i].length; j++) {        //any matrix allowed, incl square one mx[i].length line length
                if ((mx[i][j] % 2 == 0) && i % 2 == 0) {
                    mx[i][j] = mx[i][j] * 2;
                } else if ((mx[i][j] % 2 != 0) && i % 2 != 0) {
                    mx[i][j] = mx[i][j] * 2;
                }
            }
        }
        return mx;
    }
}
