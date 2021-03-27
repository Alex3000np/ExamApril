package RetakeLukas.MostProductiveYear;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MostProductiveYear2 {          //Code By Lukas:

    public static void main(String[] args) {
        System.out.println(mostProductiveYear("marvel"));
        System.out.println(mostProductiveYear("paramount"));
        System.out.println(mostProductiveYear("ghibli"));

    }

    public static String mostProductiveYear(String studioName) {
        Path filePath = Paths.get(studioName + ".csv");
        List<String> lines;
        HashMap<Integer, Integer> map = new HashMap<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            return "Cannot find studio " + studioName + ", please try again later.";
        }

        int year, current;
        for (String line : lines) {
            year = getYear(line);
            if (map.containsKey(year)) {
                current = map.get(year);
                map.replace(year, current + 1); //put is going to work as well
            } else {
                map.put(year, 1);
            }
        }

        return String.valueOf(getMaxYear(map));
    }

    public static int getYear(String line) {
        return Integer.parseInt(line.split(",")[1]);
    }

    public static int getMaxYear(HashMap<Integer, Integer> map) {
        int maxKey = 0;
        int maxValue = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }

}

