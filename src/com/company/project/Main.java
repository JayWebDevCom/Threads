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

        // process of controlling when threads execute code and access the heap is known as synchronization
        // prevents thread interference within synchronised method

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
