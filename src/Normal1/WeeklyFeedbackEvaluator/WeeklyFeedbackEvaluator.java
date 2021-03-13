package Normal1.WeeklyFeedbackEvaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;           //!!!!!!!!!!!!!!!!!!!!!!!!!! read to string > array > 4x sub arrays 

public class WeeklyFeedbackEvaluator {
    public static void main(String[] args) throws IOException {
        var output = mentorFeedback("src/Normal1/WeeklyFeedbackEvaluator/responses.txt");
    }
    public static Map<String, Double> mentorFeedback(String filepath) throws IOException {
        Path data = Paths.get(filepath);
        List<String> lines = Files.readAllLines(data);   //reading each line into "lines" List
        ArrayList<String[]> nums = new ArrayList<>();     //ArrayList with String[] arrays
        double[] results = new double[4];

        for (String l : lines) {
            nums.add(l.split(" "));                  //adding four string arrays to ArrayList
        }

        for (String[] n : nums) {
            results[0] += Double.parseDouble(n[0]) / lines.size();
            results[1] += Double.parseDouble(n[1]) / lines.size();
            results[2] += Double.parseDouble(n[2]) / lines.size();
            results[3] += Double.parseDouble(n[3]) / lines.size();
        }
        return makeFeedbackMap(results);
    }

    public static Map<String, Double> makeFeedbackMap(double[] input) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("matReview", input[0]);
        map.put("presSkills", input[1]);
        map.put("helpfulness", input[2]);
        map.put("explanations", input[3]);

        return map;
    }
}
