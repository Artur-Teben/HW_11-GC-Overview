package main.java.teben.memory;

import java.util.Random;

public class OutOfMemoryError {
    public void callError() {
        while (true) {
            int[] garbageArray = new int[new Random().nextInt(1_000_000_000)];
        }
    }
}
