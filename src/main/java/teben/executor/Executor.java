package main.java.teben.executor;

import main.java.teben.memory.OutOfMemoryError;

public class Executor {
    public void startApplication() {
        OutOfMemoryError dataGarbage = new OutOfMemoryError();
        dataGarbage.callError();
    }
}
