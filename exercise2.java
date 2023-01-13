import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("Drving School");
        scan.close();
    }

    static void drive(String car) {

        System.out.println("Driving!");
        driving(car);

        String feedback = getFeedBack(car);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            retake(car);

            // Recursive call
            drive(car);
        } else if (feedback.equals("yes")) {
            passed(car);
        }
    }

    static void driving(String car) {
        System.out.println("Driving Car");
    }

    static String getFeedBack(String car) {
        System.out.println("does the " + car + " passed the lesson? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void retake(String car) {
        System.out.print("Enter additional skills needed:");
        String skills = scan.next();
        System.out.println("Retaking lesson and exam. Done " + skills);
    }

    static void passed(String car) {
        System.out.println("Passed " + car);
    }

}