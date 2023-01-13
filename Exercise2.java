import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        train("Driver");
        scan.close();
    }

    static void train(String school) {

        System.out.println("Driving!");
        test(school);

        String feedback = getFeedBack(school);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(school);

            // Recursive call
            train(school);
        } else if (feedback.equals("yes")) {
            info(school);
        }
    }

    static void test(String school) {
        System.out.println("Testing Driving Skills");
    }

    static String getFeedBack(String school) {
        System.out.println("Is the " + school + " good enough? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String school) {
        System.out.print("Enter additional driving lesson:");
        String lesson = scan.next();
        System.out.println("Fixing driving. Learned " + import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        train("Driver");
        scan.close();
    }

    static void train(String school) {

        System.out.println("Driving!");
        test(school);

        String feedback = getFeedBack(school);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(school);

            // Recursive call
            train(school);
        } else if (feedback.equals("yes")) {
            info(school);
        }
    }

    static void test(String school) {
        System.out.println("Testing Driving Skills");
    }

    static String getFeedBack(String school) {
        System.out.println("Is the " + school + " good enough? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String school) {
        System.out.print("Enter additional driving lesson:");
        String lesson = scan.next();
        System.out.println("Fixing driving. Learned " + lesson);
    }

    static void info(String school) {
        System.out.println(school + " is good to get license.");    }
}
);
    }

    static void info(String school) {
        System.out.println(school + " is good to get license.");    }
}
