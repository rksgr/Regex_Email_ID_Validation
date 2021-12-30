import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {
    /*
    Use case 1: Validate Mandatory part 1 of email- start characters
    */
    public static boolean validateStartCharEmail(String test_email_id){
        Pattern pattern = Pattern.compile("[a-z]{3,}[a-zA-Z0-9~.!@#$%^&*()_]{1,}");
        Matcher matcher = pattern.matcher(test_email_id);
        Boolean matchFound = matcher.matches();
        if (matchFound){
            System.out.println("Correct Email.");
        }else {
            System.out.println("Incorrect Email.");
        }
        return matchFound;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
        System.out.println("Today we shall perform email ID validation.");
        validateStartCharEmail("abc@bridgelabz.com");
    }
}
