package regex.Extraction_Problem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractionWebpage {
    public static void main(String[] args) {
        String sentence = "Visit https://www.google.com and http://example.org for more info ";
        String regex = "https?://(www\\\\.)?([a-zA-Z0-9.-]+)";
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
