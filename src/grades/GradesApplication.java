package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        Student quan = new Student("Quan");
        students.put( "Quan", "XquanX11");
        quan.addGrade(100);
        quan.addGrade(75);
        quan.addGrade(91);

        Student braden = new Student("Braden");
        students.put("Braden", "XbradenX12");
        braden.addGrade(75);
        braden.addGrade(79);
        braden.addGrade(85);

        Student chris = new Student("Chrissette");
        students.put("Chrissette", "XchrissetteX13");
        chris.addGrade(100);
        chris.addGrade(100);
        chris.addGrade(101);

        Student edith = new Student("Edith");
        students.put("Edith", "XedithX14");
        edith.addGrade(75);
        edith.addGrade(60);
        edith.addGrade(85);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        System.out.println(students.values());
        System.out.println();
        String seeInfo = "What student would you like to see more information on?";
        System.out.println(seeInfo);
        System.out.println();
        System.out.println(students.keySet() );
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine().toLowerCase();

        switch (userChoice)
        {
            case "edith":
                System.out.println("Edith");
                break;
            case "quan":
                System.out.println("Quan");
                break;
            case "chrissette":
                System.out.println("Chrissette");
                break;
            case "braden":
                System.out.println("Braden");
                break;
            default:
                System.out.println("Please make a valid selection...");

        }

    }
}
