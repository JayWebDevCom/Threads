package com.company;

public class Main {

    public static void main(String[] args) {
        // threads don't always run in the expected order
        // can't start an instance of a thread more than once or one that is already running
        // will throw an exception

        System.out.println("Written in the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        // anonymous class must be started immediately
        new Thread() {
            public void run(){
                System.out.println("Written in anonymous class thread");
            }
        }.start();

        // anonymous class lambda invocation
        new Thread(() -> System.out.println("Written in second anonymous class thread")).run();

        System.out.println("Written again in the main thread");

    }
}
