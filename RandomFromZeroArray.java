import java.util.Random;

public class RandomFromZeroArray {
    public static void main(String[] args) {
        int[] arr = new int[10]; 

        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length); 
        System.out.println("Random index: " + randomIndex);
        System.out.println("Value at that index: " + arr[randomIndex]); 
    }
}