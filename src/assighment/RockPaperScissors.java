package assighment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
//        variables thingy

        String userchoice = null;
        int userchoicenumber;

        String comIA = null;
        int computerIA;
        String result = null;
        boolean invalidInPut = false;

//input

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println(" pick any of these \n 1) for scissor \n 2) for rock \n 3) for paper");
        userchoicenumber = input.nextInt();
        computerIA = rand.nextInt(3) + 1;

//computer play
            if (computerIA == 1)
                comIA = "Scissor";
            else if (computerIA == 2)
                comIA = "Rock";
            else if (computerIA == 3)
                comIA = " Paper";
//person play
            if (userchoicenumber == 1) {
                userchoice = " Scissor";
            } else if (userchoicenumber == 2)
                userchoice = "Rock";
            else if (userchoicenumber == 3)
                userchoice = "Paper";
//battle

//number 1 scissor

                if (userchoicenumber == 1 && computerIA == 1) {
                    System.out.println("your choice is scissor \n");
                    invalidInPut = true;
                    result = "the game is draw";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);

                } else if (userchoicenumber == 1 && computerIA == 2) {
                    System.out.println("your choice is scissor \n");
                    invalidInPut = true;
                    result = "you lose, booooooooo";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                } else if (userchoicenumber == 1 && computerIA == 3) {
                    System.out.println("your choice is scissor \n");
                    invalidInPut = true;
                    result = "damnnnnn, you win";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                }
//        number 2 rock
                if (userchoicenumber == 2 && computerIA == 1) {
                    System.out.println("your choice is rock \n");
                    invalidInPut = true;

                    result = "damnnnnn, you win";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);

                } else if (userchoicenumber == 2 && computerIA == 2) {
                    System.out.println("your choice is rock \n");
                    invalidInPut = true;
                    result = "game draw";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                } else if (userchoicenumber == 2 && computerIA == 3) {
                    System.out.println("your choice is rock \n");
                    invalidInPut = true;
                    result = "you lose, booooooooo";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                }
//        number 3 paper
                if (userchoicenumber == 3 && computerIA == 1) {
                    System.out.println("your choice is paper \n");
                    invalidInPut = true;
                    result = "you lose, booooooooo";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                } else if (userchoicenumber == 3 && computerIA == 2) {
                    System.out.println("your choice is paper \n");
                    invalidInPut = true;
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                    result = "damnnnnn, you win";
                } else if (userchoicenumber == 3 && computerIA == 3) {
                    System.out.println("your choice is paper \n");
                    invalidInPut = true;
                    result = "the game is draw";
                    System.out.println("the computer choice is " + comIA + "\n");
                    System.out.println(result);
                }

//        invalid code
                if (invalidInPut == false) {
                    System.out.println(" whatchu doing, play seriously");
                }


            }
        }

