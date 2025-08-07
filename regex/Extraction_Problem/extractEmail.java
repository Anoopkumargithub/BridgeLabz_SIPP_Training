package regex.Extraction_Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractEmail {
    public static void main(String[] args) {
        String sentence = "Contact us at support@example.com and info@company.org";
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
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
