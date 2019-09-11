import java.util.Scanner;
import java.util.Random;

public class randomNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Please enter a positive number: ");
        int x = scan.nextInt();
        int num = x +1;
        int randNum = generator.nextInt(num);
        System.out.println(randNum);

    }
}
