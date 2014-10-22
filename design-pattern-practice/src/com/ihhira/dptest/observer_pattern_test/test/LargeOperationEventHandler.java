package com.ihhira.dptest.observer_pattern_test.test;

import com.ihhira.dptest.observer_pattern_test.core.LargeOperationEventListener;

/**
 * created on 8/25/14.
 *
 * @author Md Imran Hasan Hira (imranhasanhira@gmail.com)
 */
public class LargeOperationEventHandler implements LargeOperationEventListener {
    @Override
    public void onStart(String msg) {
        System.out.println(msg);
    }

    @Override
    public void onCommandSend(String commandString) {

    }

    @Override
    public void onResponseReceive(String responseString) {

    }

    @Override
    public void onEnd(String msg) {
        System.out.println(msg);
    }
}
