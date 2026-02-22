package core.basics;
import java.util.Random;
public class RandomNumberAndCoinFlipDemo_V08 {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        boolean isHeads;

        number = random.nextInt(1, 7);

        isHeads = random.nextBoolean();

        System.out.println(number);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
