package com.java.cursor.teben.error.memory;

import java.util.Random;

public class OutOfMemoryException {

    public void callException() {
        try {
            while (true) {
                short[] garbageArray = new short[new Random().nextInt()];
            }
        } catch (Exception e) {
            System.out.println("Heap space is overflowing");
        }
    }
}
