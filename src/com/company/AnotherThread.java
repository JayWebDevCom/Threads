package com.company;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColour.ANSI_BLUE +  "Written in another thread");
    }
}
