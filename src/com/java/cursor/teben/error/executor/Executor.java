package com.java.cursor.teben.error.executor;

import com.java.cursor.teben.error.memory.OutOfMemoryException;

public abstract class Executor {
    public static void startApplication() {
        OutOfMemoryException dataGarbage = new OutOfMemoryException();
        dataGarbage.callException();
    }
}
