package regex.Replace_And_Modify;

import java.util.ArrayList;

public class Censor_words {
    public static void main(String[] args) {
        String str = "This is a damn bad example with some stupid words";
        ArrayList<String> badWords = new ArrayList<String>(java.util.Arrays.asList("damn", "stupid"));
        String[] words = str.trim().split("\\s+");
        for(String word : words){
            if (badWords.contains(word)) {
                System.out.print("**** ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
}
