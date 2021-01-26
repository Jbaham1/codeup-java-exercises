public class ControlFlowExercises {
    public static void main(String[] args) {
        //Problem 1a
//        int i = 5;
//        while(i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }
//        //Problem 1b
//       int num = 0;
//        do{
//            System.out.println("i is now " + num);
//            num++;
//            num++;
//        } while(num <=100);
////Problem 1C
//        for(int iter =5; iter <= 15; iter++){
//            System.out.println("i is " + iter);
//        }
//    }
        //Problem 2
        for (int i1 = 0; i1 >= 100; i1++) {
            if (i1 % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i1 % 5 == 0) {
                System.out.println("Buzz");
            } else if (i1 % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i1);
            }
            System.out.println(i1);
        }
    }
}
