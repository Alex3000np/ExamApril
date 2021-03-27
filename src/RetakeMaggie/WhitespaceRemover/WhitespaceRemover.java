package RetakeMaggie.WhitespaceRemover;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WhitespaceRemover {
    public static void main(String[] args) throws Exception {
        removeWhitespace("src/RetakeMaggie/WhitespaceRemover/origText.txt");
    }

    public static void removeWhitespace(String path) throws Exception {
        String textString;
        Path fileData = Paths.get(path);

        try {
            textString = Files.readString(fileData);
        } catch (IOException e) {
            throw new Exception("ty pidor");
        }
//        for (int i = 0; i < 999; i++) {
//            textString= textString.replace("  "," "); //1st option - it works
//        }

        textString = textString.replaceAll(" +", " "); //2nd option

        //writing
        Path outputPath = Paths.get("src/RetakeMaggie/WhitespaceRemover/outputText.txt");
        Files.write(outputPath, textString.getBytes());

//        return textString;
    }
}
