package examples;

import java.time.LocalDateTime;

public class TestFusedLoopTime {
    public static void main (String[] args){
        int startTime, endTime;
        int x;
        final int REAPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        for (x=0; x < REAPEAT; ++x)
            method1();
        for (x=0;x <REAPEAT; ++x)
            method2();

        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("time for loops  executed  seperatly: " + ((endTime - startTime) / FACTOR + " millionseconds"));
        now = LocalDateTime.now();
        startTime = now.getNano();
        for (x=0 ; x< REAPEAT; ++x)
        {
            method1();
            method2();
        }
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("time for loops executed in a block; " + ((endTime - startTime)/ FACTOR) + " millionseconds");

    }
    public static void method1(){

    }
    public static void method2(){

    }
}
