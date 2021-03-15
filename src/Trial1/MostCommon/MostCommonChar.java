package Trial1.MostCommon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class MostCommonChar {
    public static void main(String[] args) throws Exception {
        mostCommon("src/Trial1/MostCommon/sourceFile.txt");
    }

    //reading
    public static HashMap<Character, Integer> mostCommon(String filepath) throws Exception {
        Path userInput = Paths.get(filepath);
        String origText;
        String stringText;
        int counter = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();        //empty map will be populated
        try {
            stringText = Files.readString(userInput);
        } catch (IOException e) {
            throw new Exception("Ty pidor");
        }
        char[] arr = stringText.toCharArray();
        for (char x : arr) {
            if (myMap.containsKey(x)) {                             //not clear for me
                counter = myMap.get(x);                             //map.get() returns value of key x
                myMap.put(x, counter + 1);
            } else {
                myMap.put(x, 1);
            }
        }
        return null;
    }


    public static Integer getMax(HashMap<Character, Integer> mapX) {
        for (Integer z : mapX.get(z)) {

        }
        return null;
    }

}
