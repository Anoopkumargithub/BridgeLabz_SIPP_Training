package regex.Advance_Problem;

public class validateCreditCard{
    public static void main(String[] args) {
        String[] cardNumbers = {
            "4123456789012345", 
            "5123456789012345", 
            "6123456789012345", 
            "412345678901234",  
            "51234567890123456" 
        };

        String visaRegex = "^4\\d{15}$";
        String masterCardRegex = "^5\\d{15}$";

        for (String card : cardNumbers) {
            if (card.matches(visaRegex)) {
                System.out.println(card + " is a valid Visa card.");
            } else if (card.matches(masterCardRegex)) {
                System.out.println(card + " is a valid MasterCard.");
            } else {
                System.out.println(card + " is not a valid Visa or MasterCard.");
            }
        }
    }
}
