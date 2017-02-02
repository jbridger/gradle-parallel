package com.jwhbridger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 10; i++) {
            System.out.println("RUNNING " + args[0]);
            Thread.sleep(1000);
        }

        System.out.println("COMPLETE " + args[0]);
    }
}
