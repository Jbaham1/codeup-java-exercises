import java.util.Scanner;

public class MethodsExercises<userInput> {
    public static void main(String[] args) {
        System.out.println("Addition: " + addition(3, 2));
        System.out.println("Subtraction: " + subtraction(3, 2));
        System.out.println("Multiplication: " + multiplication(3, 2));
        System.out.println("Division: " + division(6, 3));
        System.out.println("Modulus: " + modulus(7, 10));
        System.out.println("Multiplication sans '*': " + multiplication2(5, 5));
        System.out.println(getInteger(1, 10));
        System.out.println(getFactorial(7));
    }

    //Problem 1
    public static double addition(int a, int b) {
        return a + b;
    }

    public static double subtraction(int c, int d) {
        if (c < d) {
            return d - c;
        } else {
            return c - d;
        }
    }

    public static double multiplication(int e, int f) {
        return e * f;
    }

    public static double division(int g, int h) {
        if (g < h) {
            return h / g;
        } else {
            return g / h;
        }
    }

    public static double modulus(int i, int j) {
        if (i < j) {
            return j % i;
        } else {
            return i % j;
        }
    }

    public static double multiplication2(int k, int l) {
        int result = 0;
        for (int m = 1; m <= l; m++) {
            result = result + k;
        }
        return result;
    }

    //Problem 2
    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between between " +min +" and "+ max + ": ");
        int userInput = input.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Enter a VALID number between " +min +" and "+ max + ": ");
            return getInteger(min, max);
        } else {
            System.out.println("Your number is: ");
        }
        return userInput;
    }

    //Problem 3
    public static long getFactorial(long num) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        long userInput = input.nextInt();
        long factorial = userInput;

        if (num > 10 || num < 1) {
            return getFactorial(num);
        } else {
            for (long i = 1; i <= 10; i++) {
                factorial = factorial * i;
                System.out.println("!" + i + " = " + factorial);
            }
        }
        System.out.println("Do you want to continue?");
        return userInput;
    }
//Problem 4
    public static int rollDice(int one, two){
        Scanner dice = new Scanner(System.in);
        System.out.println("How many sides of dice do you want?");
        int userDice = dice.nextInt();
    }
}

