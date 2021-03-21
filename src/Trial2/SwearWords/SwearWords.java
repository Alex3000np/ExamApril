package Trial2.SwearWords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SwearWords {
    public static void main(String[] args) throws IOException {
        String[] input = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        System.out.println(removeStopWord(input));
    }

    public static Integer removeStopWord(String[] stopWords) throws IOException {
        String textString = "";

        Path data = Paths.get("src/Trial2/SwearWords/textBeforeManipulation.txt");  //reading
        try {
            textString = Files.readString(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int counter = 0;                                                                  //counts deletions
        textString = textString.toLowerCase();                                            //
        for (String xxx : stopWords) {                                                    //iterating through stopwords string array
            while (textString.contains(xxx)) {
                textString = textString.replaceFirst(xxx, "");
                counter++;
            }
        }
        System.out.println(textString);

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/Trial2/SwearWords/textAfterManipulation.txt")); //writing to file
        writer.write(textString);
        writer.close();

        return counter;
    }
}
