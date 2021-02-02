import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args){
        String randomWord1 = randomElem(adjectives);
        String randomWord2 = randomElem(nouns);
        System.out.println(randomWord1+"-"+randomWord2);
    }
    private static String[] adjectives = {"aggressive","colossal","little","clumsy","eager","elegant","drab","calm","thoughtless","teeny"};
    private static String[] nouns = {"cat","ship","hero","babies","sock","building","meadow","house","Miami","diamond"};

    public static String randomElem(String[] arr){
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(arr.length);
        return arr[randInt];
    }
}
