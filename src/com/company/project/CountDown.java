package com.company.project;

import com.company.ThreadColour;

public class CountDown {

    private int i; //  private instance variable

    public void doCountdown() {

        String colour; // local variable stored on the thread stack so each thread will have its own copy
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

        // use 'object lock' on non-primitive types
        // don't use local variable to synchronise object lock
        // object reference is stored on the stack but value is stored on the heap
        synchronized(this) {
            for (i = 10; i > 0; i--) {
                System.out.println(colour + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}
