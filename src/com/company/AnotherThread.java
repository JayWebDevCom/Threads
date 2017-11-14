package com.company;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Written in another thread");
    }
}
