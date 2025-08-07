package regex.Advance_Problem;

import java.util.ArrayList;

public class ExtractProgrammingLanguage {
    public static void main(String[] args) {
        String str = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        ArrayList<String> programmingLanguage = new ArrayList<String>(java.util.Arrays.asList("Java", "Python", "JavaScript"));
        String[] words = str.trim().split("\\s+");
        for(String word : words){
            // Remove punctuation from the word
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (programmingLanguage.contains(cleanWord)) {
                System.out.println(cleanWord);
            } 
        }
    }
}
