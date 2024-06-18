import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void firstName(String firstname){
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match= pattern.matcher(firstname);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Inavaid input");
        }
    }

    public static void lastName(String lastname){
        Pattern pattern=Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match= pattern.matcher(lastname);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Inavaid input");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstname= sc.nextLine();
        firstName(firstname);
        System.out.print("Enter the Last name: ");
        String lastname=sc.nextLine();
        lastName(lastname);

    }
}