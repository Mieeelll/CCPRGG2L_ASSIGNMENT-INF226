import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Email: ");
        String studentEmail = scan.nextLine();

        System.out.print("Enter cellphone Number: ");
        String cellphoneNum = scan.nextLine();

        System.out.print("Enter Birthday: ");
        String birthDay = scan.nextLine();

        System.out.println();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }


        match = Pattern.compile("\\+63\\d{10}").matcher(cellphoneNum).matches();

        if (match) {
            System.out.println("valid cellphone number");
        } else {
            System.out.println("invalid cellphone number");
        }


        match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", birthDay);

        if (match) {
            System.out.println("valid Birthday");
        } else {
            System.out.println("invalid Birthday ");
            
        }
    }
}