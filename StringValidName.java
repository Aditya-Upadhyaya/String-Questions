import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    
    public static final String regularExpression = "[a-zA-Z]+[a-zA-Z0-9_]{7,30}";
}
public class StringValidName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
        scan.close();
    }
}
