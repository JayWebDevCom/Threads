package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Written in the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println("Written again in the main thread");
    }
}
