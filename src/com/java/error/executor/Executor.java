package com.java.error.executor;

import com.java.error.memory.OutOfMemoryException;

public class Executor {
    public void startApplication() {
        OutOfMemoryException dataGarbage = new OutOfMemoryException();
        dataGarbage.callException();
    }
}
