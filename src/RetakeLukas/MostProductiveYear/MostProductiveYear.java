package RetakeLukas.MostProductiveYear;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MostProductiveYear {
    public static void main(String[] args) {

        System.out.println(mostProductiveYear("src/RetakeLukas/MostProductiveYear/Marvel"));

    }

    public static String mostProductiveYear(String studioName) {
        ArrayList<String> yearsList = new ArrayList<>();       //collect years here
        Path dataX = Paths.get(studioName + ".csv");
        List<String> stringList;                               //reads here

        try {
            stringList = Files.readAllLines(dataX);
        } catch (IOException e) {
            return "Cannot find studio " + studioName + ", please try again later.";
        }
        for (String s : stringList) {                           //adding years to array
            String[] x = s.split(",");
            yearsList.add(x[1]);
        }

        int counterMax = 0;
        String maxStr = "";
        for (String x : yearsList) {                            //double foreach finds maxcounter & year
            int counterTemp = 0;
            for (String z : yearsList) {
                if (x.equals(z)) {
                    counterTemp++;
                }
                if (counterTemp > counterMax) {
                    counterMax = counterTemp;
                    maxStr = x;
                }
            }
        }
        return maxStr;
    }
}
