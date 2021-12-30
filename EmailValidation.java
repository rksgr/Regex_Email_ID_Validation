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
    /*
    Use case 2: Validate Mandatory part 2 of email- bridgelabz after @
    */
    public static boolean validateEmailDomain(String test_email_id){
        Pattern pattern = Pattern.compile("[a-z]{3,}[@][b][r][i][d][g][e][l][a][b][z][a-zA-Z~!@#$%^&*().]{1,}");
        Matcher matcher = pattern.matcher(test_email_id);
        Boolean matchFound = matcher.matches();
        if (matchFound){
            System.out.println("Correct Email.");
        }else {
            System.out.println("Incorrect Email.");
        }
        return matchFound;
    }
    /*
    Use case 3: Validate Mandatory part 3 of email- . and co after bridgelabz
    */
    public static boolean validateCharAfterDomain(String test_email_id){
        Pattern pattern = Pattern.compile("[a-z]{3,}[@][b][r][i][d][g][e][l][a][b][z][.][c][o][a-zA-Z~!@#$%^&*().]*");
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
        validateCharAfterDomain("abc@bridgelabz.co");
    }
}
