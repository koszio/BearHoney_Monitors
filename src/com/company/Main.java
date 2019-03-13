package com.company;


public class Main {

    public static void main(String[] args) {

        int buffer = 10;
        int numberOfThreads = 20;
        BoundedBuffer bf = new BoundedBuffer(buffer);

        //    Producer prod = new Producer(bf, buffer);
        Consumer cons = new Consumer(bf, 10);


        //Create an array of threads which will produce
        Thread[] prodThreads = new Thread[numberOfThreads];

        //Create each thread and store it in the prodThreads array
        for (int i = 0; i < prodThreads.length; i++) {
            prodThreads[i] = new Thread(new Producer(bf, buffer), "Producer number " + i);
            System.out.println("Thread " + i + " has been created");

        }
        //Start the consumer thread
        cons.start();


        System.out.println("Initially the Elements in the buffer are (Should be null): ");
        System.out.print("[");
        int counter = 0;
        for (int i = 0; i < buffer; i++) {

            System.out.print(" " + bf.items [i]);
            counter++;
        }
        System.out.print(" ]");
        System.out.println();


        //Start each one of the Producer threads that were created and stored in the array
        for (int i = 0; i < prodThreads.length; i++) {
            prodThreads[i].start();
            System.out.println("Thread " + i + " have been Started");

        }
        try {
            for (int i = 0; i < prodThreads.length; i++) {

                prodThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Ops.............");
        }

    }
}
