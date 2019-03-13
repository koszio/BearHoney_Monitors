package com.company;

public class Producer extends Thread {


    private BoundedBuffer boundedBuffer;
    private int n;

    //Constructor
    public Producer(BoundedBuffer boundedBuffer, int n) {
        this.boundedBuffer = boundedBuffer;
        this.n = n;
    }

    @Override
    public void run() {
        int value;
        while (true) {

            value = (int) (Math.random() * 100);
            boundedBuffer.put(value);
            System.out.println("Producer " + currentThread().getId() + " produced"+"........... the value " + value + " in the buffer");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }


}
