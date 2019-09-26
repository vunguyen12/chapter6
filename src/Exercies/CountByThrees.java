package Exercies;

public class CountByThrees {
    public static void main (String[]args){
        int count = 0;
        while (count <= 300) {
            System.out.print( " " + count);
            count = count + 3;
            if(count % 30 == 0){
                System.out.println();
            }

        }

    }
        }

