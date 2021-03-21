package Trial1.MostCommon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class MostCommonChar {
    public static void main(String[] args) throws Exception {
        System.out.println(mostCommon("src/Trial1/MostCommon/sourceFile.txt"));
    }

    //reading
    public static HashMap<Character, Integer> mostCommon(String filepath) throws Exception {
        Path userInput = Paths.get(filepath);                            //reading
        String stringText;

        try {
            stringText = Files.readString(userInput);
        } catch (IOException e) {
            throw new Exception("Ty pidor");
        }

        HashMap<Character, Integer> collectMap = new HashMap<>();        //empty map will be populated <K,V>
        HashMap<Character, Integer> resultMap = new HashMap<>();
        int counter;
        char[] fileTextArray = stringText.toCharArray();                 //turn string to char array

        for (char x : fileTextArray) {                                   //iterating trough an array
            if (collectMap.containsKey(x)) {                             //starts to check empty map and populates it
                counter = collectMap.get(x);                             //map.get() returns VALUE of KEY x
                collectMap.put(x, counter + 1);                          //populating initially empty map
            } else {
                collectMap.put(x, 1);                                    //otherwise its first appearance of a character
            }
        }
        //we create function getMax() first, see below
        resultMap.put(getMax(collectMap), collectMap.get(getMax(collectMap)));       //put (maxChar KEY, VALUE of maxChar) tu resultMap
        collectMap.remove(getMax(collectMap), collectMap.get(getMax(collectMap)));   //removing first most common pair
        resultMap.put(getMax(collectMap), collectMap.get(getMax(collectMap)));       //repeat again put, to find second pair

        return resultMap;
    }

    public static char getMax(HashMap<Character, Integer> mapX) {         //we want to find maxKey (difficult to find KEY, value can be found by HashMap.get(keyX))
        int maxValue = 0;
        char maxChar = 0;
        for (char z : mapX.keySet()) {                                    //iterating trough KEYS in map, (keySet() returns a set of KEYS of the hash map.)
            if (mapX.get(z) > maxValue) {                                 //if key VALUE > maxValue...
                maxChar = z;
                maxValue = mapX.get(z);
            }
        }
        return maxChar;
    }

}
