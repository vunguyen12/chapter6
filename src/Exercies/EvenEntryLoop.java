package Exercies;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {

        int userinput;
        Scanner input = new Scanner(System.in);
        System.out.println("plase enter a number");
        userinput = input.nextInt();

        while (userinput != 999) {
            System.out.println("plase enter a number");
            userinput = input.nextInt();
            if (userinput % 2 == 0) {
                System.out.println("the number is even");
            } else {
                System.out.println("the number is odd");
            }
            System.out.println("if you want to exit, type 999 to exit");
        }

        }

}

