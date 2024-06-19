import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String firstName(String firstname) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match = pattern.matcher(firstname);
        boolean ismatch = match.matches();
        if (ismatch) {
           return "Happy";
        } else {
            return "Sad";
        }
    }

    public static String lastName(String lastname) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher match = pattern.matcher(lastname);
        boolean ismatch = match.matches();
        if (ismatch) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public static String emailId(String emailid) {
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match = pattern.matcher(emailid);
        boolean ismatch = match.matches();
        if (ismatch) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public static String phoneNo(String phoneno) {
        Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}$");
        Matcher match = pattern.matcher(phoneno);
        boolean ismatch = match.matches();
        if (ismatch) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public static String Password(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]{1,})(?=.*[0-9]{1,}).*[a-z](?=.*[!@#$%&]{1})(.{7,})$");
        Matcher match = pattern.matcher(password);
        boolean ismatch = match.matches();
        if (ismatch) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Welcome to User Registration ***");
        int num = 1;

        while (num > 0) {
            System.out.println("\n 1.First Name Validation \n 2.Last Name Validation \n 3.Email Validation \n 4.Mobile Number Validation \n 5.Password Validation \n 0.Exit");
            System.out.println("Enter your choice :");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Enter a First Name : ");
                    String first_name = sc.nextLine();
                    System.out.println(firstName(first_name));
                    break;

                case 2:
                    System.out.println("Enter a Last Name : ");
                    String last_name = sc.nextLine();
                    System.out.println(lastName(last_name));
                    break;

                case 3:
                    System.out.println("Enter a Email : ");
                    String email = sc.nextLine();
                    System.out.println(emailId(email));
                    break;

                case 4:
                    System.out.println("Enter a Phone Number : ");
                    String phoneno = sc.nextLine();
                    System.out.println(phoneNo(phoneno));
                    break;

                case 5:
                    System.out.println("Enter a Password : ");
                    String password = sc.nextLine();
                    System.out.println(Password(password));
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
