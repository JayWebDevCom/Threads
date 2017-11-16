package com.company.project;

public class Main {
    public static void main(String[] args) {

        // system switches between the three threads
        // order cannot be predicted

        CountDown threadCountdown = new CountDown();

        CountDownThread countDownThread = new CountDownThread(threadCountdown);
        countDownThread.setName("Thread-1");

        CountDownThread countDownThread2 = new CountDownThread(threadCountdown);
        countDownThread2.setName("Thread-2");

        CountDownThread countDownThread3 = new CountDownThread(threadCountdown);
        countDownThread3.setName("Thread-3");

        countDownThread.start();
        countDownThread2.start();
        countDownThread3.start();

    }
}
