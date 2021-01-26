public class MethodsExercises {
    public static void main(String[] args){
        System.out.println("Addition: " + addition(3, 2));
        System.out.println("Subtraction: " + subtraction(3, 2));
        System.out.println("Multiplication: "+ multiplication(3, 2));
        System.out.println("Division: "+ division(6, 3));
        System.out.println("Modulus: "+ modulus(7, 10));
        System.out.println("Multiplication sans '*': "+ multiplication2(5, 3));
    }
    //Problem 1
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int c, int d) {
        if (c < d) {
            return d - c;
        } else {
            return c - d;
        }
    }
    public static int multiplication(int e, int f){
        return e * f;
    }
    public static int division(int g, int h){
        if (g < h) {
            return h / g;
        } else {
            return g / h;
        }
    }
    public static int modulus(int i, int j){
        if (i < j) {
            return j % i;
        } else {
            return i % j;
        }
    }
    public static int multiplication2(int k, int l){
        return k * l;
    }
}
