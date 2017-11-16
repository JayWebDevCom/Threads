package com.company;

import static com.company.ThreadColour.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +  "Written in another thread");
        System.out.println(ANSI_BLUE +  "Written in: " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // exception if another thread wakes this one up
            System.out.printf("%sAnother thread woke me up, I am: %s%n", ANSI_BLUE, currentThread().getName());
            e.printStackTrace();
        }

        System.out.println(ANSI_BLUE +  "3 secs have passed - sleep over!");
    }
}
