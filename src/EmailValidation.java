import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = input.nextLine();
        String regEx = ("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not found");
        }
    }

}
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("tamilnilag@gmail.com", Pattern.LITERAL);
//        Matcher matcher = pattern.matcher("amarnathg@gmail.com");
//        boolean matchFound = matcher.find();
//        if(matchFound){
//            System.out.println("The email address is valid");
//        }
//        else{
//            System.out.println("invalid");
//        }
//    }
//}
