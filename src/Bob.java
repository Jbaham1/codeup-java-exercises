import java.util.Locale;
import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type to talk to Bob. ");
        String userInput = scanner.nextLine().trim();
        boolean question =userInput.endsWith("?");
        boolean yell = userInput.endsWith("!");
        boolean ignore = userInput.isEmpty();

        if(question) {
            System.out.println("Sure");
        }else if (yell){
            System.out.println("Whoa, Chill out!");
        } else if (ignore){
            System.out.println("Fine. Be that way!");
        } else{
            System.out.println("Whatever.");
        }
    }
}
