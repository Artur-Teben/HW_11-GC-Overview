package com.java.error.memory;

import java.util.Random;

public class OutOfMemoryException {

    public void callException() {
        try {
            Random r = new Random();
            while (true) {
                short[] garbageArray = new short[r.nextInt()];
            }
        } catch (Exception e) {
            System.out.println("Heap space is overflowing");
        }
    }
}
