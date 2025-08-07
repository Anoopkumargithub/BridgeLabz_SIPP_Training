package regex.Replace_And_Modify;

public class Multiple_spaces_to_single_spaces {
    public static void main(String[] args) {
        String str = "This     is an     example with multiple    spaces.";
        String result = str.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
