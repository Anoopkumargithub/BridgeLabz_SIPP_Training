package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}";
        Pattern pattern = Pattern.compile(regex);
         String[] colors = {"#FFA500", "#ff4500", "#123"};
         for (String color : colors) {
            Matcher matcher = pattern.matcher(color);
            System.out.println(color + " is valid: " + matcher.matches());
        }
    }
}
