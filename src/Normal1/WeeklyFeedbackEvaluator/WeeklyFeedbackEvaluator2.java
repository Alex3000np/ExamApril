package Normal1.WeeklyFeedbackEvaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;                                              //my solving

public class WeeklyFeedbackEvaluator2 {
    public static void main(String[] args) throws IOException {
        System.out.println(mentorFeedback("src/Normal1/WeeklyFeedbackEvaluator/responses.txt"));

    }

    public static HashMap<String, Double> mentorFeedback(String filePath) throws IOException {
        Path data = Paths.get(filePath);
        List<String> rows = Files.readAllLines(data);            //List<String> same as array, contains rows with Strings (rows.get(0) -> 1 3 5 3)
        ArrayList<String[]> arrayList = new ArrayList<>();       //arrayList with string[] arrays
        HashMap<String, Double> resultsMap = new HashMap<>();

        for (String stringX : rows) {
            arrayList.add(stringX.split(" "));              //each row (eg 1 3 5 3) is splitted with space, and added to arrayList
        }


        String[] row1 = arrayList.get(0);                          //adds row to String array
        String[] row2 = arrayList.get(1);
        String[] row3 = arrayList.get(2);
        String[] row4 = arrayList.get(3);

        double result1 = ((Integer.parseInt(row1[0]) + Integer.parseInt(row2[0]) + Integer.parseInt(row3[0]) + Integer.parseInt(row4[0])) / 4.0);
        double result2 = ((Integer.parseInt(row1[1]) + Integer.parseInt(row2[1]) + Integer.parseInt(row3[1]) + Integer.parseInt(row4[1])) / 4.0);
        double result3 = ((Integer.parseInt(row1[2]) + Integer.parseInt(row2[2]) + Integer.parseInt(row3[2]) + Integer.parseInt(row4[2])) / 4.0);
        double result4 = ((Integer.parseInt(row1[3]) + Integer.parseInt(row2[3]) + Integer.parseInt(row3[3]) + Integer.parseInt(row4[3])) / 4.0);

        resultsMap.put("matReview", result1);
        resultsMap.put("presSkills", result2);
        resultsMap.put("helpfulness", result3);
        resultsMap.put("explanations", result4);

        return resultsMap;
    }
}
