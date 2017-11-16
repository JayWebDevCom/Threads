package com.company;

public class Main {

    public static void main(String[] args) {
        // threads don't always run in the expected order
        // can't start an instance of a thread more than once or one that is already running
        // will throw an exception

        System.out.println(ThreadColour.ANSI_PURPLE + "Written in the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        // anonymous class must be started immediately
        new Thread() {
            public void run(){
                System.out.println(ThreadColour.ANSI_GREEN + "Written in anonymous class thread");
            }
        }.start();

        // anonymous class lambda invocation
        new Thread(() -> System.out.println(ThreadColour.ANSI_RED + "Written in second anonymous class thread")).run();

        System.out.println(ThreadColour.ANSI_PURPLE + "Written again in the main thread");

    }
}
