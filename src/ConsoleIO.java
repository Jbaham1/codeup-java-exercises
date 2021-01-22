import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] arg){
        System.out.print("This is from print.\n");
        System.out.println("Hello, Kalypso!");
        System.out.printf("%s, %s!%n", "Hello", "Kalypso");
//        String greeting = ""
        double price1 = 23.45;
        double price2 = 50;
        double price3 = 5.4;
        double total = (price1+price2+price3);
//        System.out.printf("Your total is: $%7.2f%n", total);

        Scanner scanner = new Scanner(System.in);
//      Widget banana = new Widget("Jeremiah's Widget");
//        System.out.print("Please tell me your name: ");
        System.out.print("Enter something: ");
        String userInput = scanner.next();
        String userInput2 = scanner.next();
        System.out.println("You entered: -->\"" + userInput + "\"<--");
        System.out.println("And: -->\"" + userInput2 + "\"<--");
    }
}
