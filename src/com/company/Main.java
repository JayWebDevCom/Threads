package com.company;

import static com.company.ThreadColour.*;

public class Main {

    public static void main(String[] args) {
        // threads don't always run in the expected order
        // can't start an instance of a thread more than once or one that is already running
        // will throw an exception
        // call start() not run()

        System.out.println(ANSI_PURPLE + "Written in the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("**Another Thread**");
        anotherThread.start();

        // anonymous class must be started immediately
        new Thread(() -> {
            System.out.println(ANSI_GREEN + "Written in anonymous class thread");
            System.out.println(ANSI_GREEN +  "Written in: " + Thread.currentThread().getName());
        }).start();

        // anonymous class lambda invocation
        new Thread(() ->
                System.out.println(ANSI_CYAN + "Written in second anonymous class thread")
        ).start();

        // run method from MyRunnable Thread with both run methods
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                super.run();
                System.out.println(ANSI_RED + "Written in Anon Class MyRunnable implementation of run() ...");

                try {
                    // add timeout before joining
                    anotherThread.join(2000);
                    // will wait for the sleeping thread to finish sleeping - not interrupted
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed-out so I am running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "Waiting aborted. I was interrupted");
                }

            }
        });

        myRunnableThread.start();

        System.out.printf("%sWritten again in the main thread%n", ANSI_PURPLE);
    }
}
