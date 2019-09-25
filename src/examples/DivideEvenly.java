package examples;

public class DivideEvenly {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            if (count % 2 == 1)
//            number % 2 == 1 la ra so le
                System.out.println(count);
            count++;

        }
        System.out.println("_______________");
        while (count > 0) {
            if (count % 2 == 0)
                //            number % 2 == 0 la ra so chang
                System.out.println(count);
            count--;
        }
        System.out.println("_______________");
        do {
            if (count % 2 == 1)
                System.out.println(count);
            count++;
        }
        while (count < 10);
        System.out.println("_______________");

        do {
            if (count % 2 == 0)
                System.out.println(count);
            count--;
        }
        while (count >0);
        }

    }
