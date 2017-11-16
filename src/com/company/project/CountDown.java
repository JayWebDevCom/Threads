package com.company.project;

import com.company.ThreadColour;

public class CountDown {
    private int i;
    public void doCountdown() {
        String colour;
        switch (Thread.currentThread().getName()) {
            case "Thread-1":
                colour = ThreadColour.ANSI_CYAN;
                break;
            case "Thread-2":
                colour = ThreadColour.ANSI_PURPLE;
                break;
            case "Thread-3":
                colour = ThreadColour.ANSI_RED;
                break;
            default:
                colour = ThreadColour.ANSI_GREEN;
        }
        // count down from 10 using local private instance variable
        for (i = 10; i > 0; i--) {
            System.out.println(colour + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
