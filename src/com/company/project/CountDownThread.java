package com.company.project;

public class CountDownThread extends Thread {
    private CountDown threadCountdown;

    public CountDownThread(CountDown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
