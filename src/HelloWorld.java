public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //problem 1
        int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);
        //problem2
        String myString = "This is a string";
        System.out.println(myString);
        //problem 3
//        char myChar = myString;
        //problem 4
//        myString = 3.14159;
//        only works if you use double quotes and doesnt work with numbers
//        System.out.println(myString);
        //problem 5
        long myNumber;
//        System.out.println(myNumber);
//        error
        //problem 6
//        myNumber = 3.14; needs "L" after number
//problem 7
        myNumber = 123L;
        System.out.println(myNumber);
        //problem 8
        myNumber = 123;
        System.out.println(myNumber);
        //possibly works because it doesnt have a decimal point
    }
}
