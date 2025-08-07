package regex.Extraction_Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractionOfCapitalWords {
    public static void main(String[] args) {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York ";
        String regex = "^[A-Z][a-zA-Z]*$";
        Pattern pattern = Pattern.compile(regex);
         String[] words = sentence.trim().split("\\s+");
         for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if(matcher.matches()){
                System.out.println(word);
            }
        }
    }
}
