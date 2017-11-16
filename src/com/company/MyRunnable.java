package com.company;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ThreadColour.ANSI_RED + "Written in MyRunnable implementation of Run...");
    }
}
