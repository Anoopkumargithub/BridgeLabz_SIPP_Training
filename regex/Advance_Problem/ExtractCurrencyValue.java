package regex.Advance_Problem;

public class ExtractCurrencyValue {
    public static void main(String[] args) {
        String str = "The price is $45.99, and the discount is 10.50";
        str =str.replaceAll("[^a-zA-Z0-9.$]", "");
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\$\\d+(\\.\\d{2})?");
        java.util.regex.Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println("Extracted currency value: " + matcher.group());
        }
    }
}
