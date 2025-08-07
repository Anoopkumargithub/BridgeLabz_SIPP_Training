package regex.Extraction_Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractDate {
    public static void main(String[] args) {
        String sentence = "The events are scheduled for 12/05/2023  15/08/2024 and 29/02/2020";
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
         String[] dates = sentence.trim().split("\\s+");
         for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if(matcher.matches()){
                System.out.println(date);
            }
        }
    }
}
