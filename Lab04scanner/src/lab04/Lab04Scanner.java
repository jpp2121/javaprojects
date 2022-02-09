package lab04;
import java.util.Scanner;
/* Josh Parker
    Lab 04
    2-8-22
 */
public class Lab04Scanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void demoTextLine(String prompt){
        System.out.println("Enter a line of text. " + prompt + ": "); String input = scanner.nextLine();
        System.out.println("Your input text is " + input + ".");
    }
    public static void demoInt(){
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt(); System.out.println("You entered " + input + ".");
    }
    public static void taskDouble(){
        System.out.println("Enter an double: ");
        double input = scanner.nextDouble(); System.out.println("You entered " + input + ".");
    }

    public static void main(String[] args) {
        System.out.println("Lab 04. Start of Scanner Project");

        demoTextLine("one");
        demoTextLine("two");
        demoInt();
        demoInt();
        demoInt();
        demoTextLine("three");
        demoTextLine("four");
        demoTextLine("five");
        taskDouble();
        taskDouble();
        taskDouble();
        taskDouble();

        System.out.println("Lab 04. End Scanner Project");

    }
}


