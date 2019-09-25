package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 999;
        int counter = 0;
        int rand_pick = rand.nextInt(100) + 1;
        while (choice != rand_pick){
            System.out.println("please pick a number between 1 and 100 ");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println("congrat you are a good guesser ");

            } else if (choice > rand_pick) {
                System.out.println("Nope, it was lower " );

            } else if (choice < rand_pick) {
                System.out.println("nope, it was higher ");
            }
            counter++;
//            counter = counter + 1
        }
        System.out.println("it took you " + counter + " chances");
    }
}