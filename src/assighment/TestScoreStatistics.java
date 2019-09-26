package assighment;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfentries = 0;
int  high =0 ;
int low = 100;
int avg;
int scoreTotal = 0;
int userentry = 0;
while (userentry != 999 ){
    System.out.println("please enter a test score");
    userentry = input.nextInt();

    if (userentry > high && userentry <= 100){

    }
    else if (userentry<low && userentry >= 0){

    }
    else
        System.out.println("error");

    numOfentries++;
    scoreTotal = scoreTotal+ userentry;
}
    }
}
