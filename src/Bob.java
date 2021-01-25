import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob. As him questions, give statements, ANYTHING!");
        String userInput = scanner.nextLine();
        boolean question =userInput.indexOf("?") != -1;
        boolean yell = userInput.indexOf("!") != -1;
        boolean ignore = userInput.length() < 1;

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
