package com.company.project;

public class Main {
    public static void main(String[] args) {

        // system switches between the three threads
        // order cannot be predicted

        // multiple threads working with the same Countdown object and instance variables of that Countdown object
        // threads share the heap so share the the variable is that is on the heap
        // local variable for i (i.e. private int i) is ok,
        // but instance variable of i (i in for loop) works differently

        // threads interfere with each other - a race condition
        // writing a shared resource (reading does not cause an issue)

        // threads can be suspended between steps
        // thread decrements and prints

        CountDown threadCountdown1 = new CountDown();
        CountDown threadCountdown2 = new CountDown();
        CountDown threadCountdown3 = new CountDown();

        CountDownThread countDownThread = new CountDownThread(threadCountdown1);
        countDownThread.setName("Thread-1");

        CountDownThread countDownThread2 = new CountDownThread(threadCountdown2);
        countDownThread2.setName("Thread-2");

        CountDownThread countDownThread3 = new CountDownThread(threadCountdown3);
        countDownThread3.setName("Thread-3");

        countDownThread.start();
        countDownThread2.start();
        countDownThread3.start();

    }
}
