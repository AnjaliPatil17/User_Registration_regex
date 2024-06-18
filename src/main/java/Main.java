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

    public static void emailId(String emailid){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(emailid);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Inavaid input");
        }
    }

    public static void phoneNo(String phoneno){
        Pattern pattern=Pattern.compile("^[0-9]{2} [1-9][0-9]{9}$");
        Matcher match= pattern.matcher(phoneno);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Invaid input");
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
        System.out.print("Enter the Email ID : ");
        String emailid= sc.nextLine();
        emailId(emailid);
        System.out.print("Enter the Phone no : ");
        String phoneno= sc.nextLine();
        phoneNo(phoneno);

    }
}