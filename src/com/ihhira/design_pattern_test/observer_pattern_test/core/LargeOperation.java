package com.ihhira.design_pattern_test.observer_pattern_test.core;

/**
 * created on 8/25/14.
 *
 * @author Md Imran Hasan Hira (imranhasanhira@gmail.com)
 */
public class LargeOperation {
    LargeOperationEventListener listener;

    public void addListener(LargeOperationEventListener listener) {
        this.listener = listener;
    }

    public void perform() {
        listener.onStart("Started");

        CommandA commandA = new CommandA();
        String responseA = commandA.send("This is command A");


        CommandB commandB = new CommandB();
        String responseB = commandB.send("This is command B");

        listener.onEnd("Completed");

    }
}
