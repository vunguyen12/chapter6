import java.util.Scanner;

public class OpenDoorGame {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int userchoice = 4;
            System.out.println("there are three doors, each one has a difference prices. which one do you want to open ?");
        while (userchoice >=4){
            System.out.println(" press 1 to open door 1 \n press 2 to open door 2 \n press 3 to open door 3");
            userchoice = input.nextInt();


                if (userchoice == 1){
            System.out.println("you chose to open door 1 \n the price is 1 moldy apple");
        }
        else if (userchoice == 2){
            System.out.println("you chose to open door 2 \n the prize is nothing");
        }
        else if (userchoice == 3){
            System.out.println("you chose to open door 3 \n the prize is 4 diamonds");
        }
        else {
            System.out.println("the one you chose makes no sense, chose again");
        }
    }
}
}
