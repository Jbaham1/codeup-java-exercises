public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        //numbers isnt called correctly
        Person[] people = new Person[3];
        Person tariq = new Person("Tariq");
        Person james = new Person("James");
        Person tasha = new Person("Tasha");
        people[0] = tariq;
        people[1] = james;
        people[2] = tasha;
//iterate over people array and print names
        for(Person human: people){
            System.out.println(human.getName());
        }
        //add tommy to the end of the array
        Person tommy = new Person("Tommy");
        Person [] people2 = addPerson(people,tommy);
        for(Person human: people2){
            System.out.println(human.getName());
        }

    }

    public static Person[] addPerson(Person[] peep, Person human){
        Person[] morePeople = new Person[peep.length+1];
        for(int i =0; i<peep.length; i++){
            morePeople[i] = peep[i];
        }
        morePeople[morePeople.length-1]= human;
        return morePeople;
    }
}