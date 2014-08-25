package com.ihhira.design_pattern_test.observer_pattern_test.core;

/**
 * created on 8/25/14.
 *
 * @author Md Imran Hasan Hira (imranhasanhira@gmail.com)
 */
public interface LargeOperationEventListener {
    void onStart(String started);

    void onCommandSend(String commandString);

    void onResponseReceive(String responseString);

    void onEnd(String completed);
}
