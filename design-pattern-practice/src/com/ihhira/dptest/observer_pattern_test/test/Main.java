package com.ihhira.dptest.observer_pattern_test.test;

import com.ihhira.dptest.observer_pattern_test.core.LargeOperation;

/**
 * created on 8/25/14.
 *
 * @author Md Imran Hasan Hira (imranhasanhira@gmail.com)
 */
public class Main {

    public static void main(String[] args) {

        LargeOperation operation = new LargeOperation();

        LargeOperationEventHandler handler = new LargeOperationEventHandler();
        operation.addListener(handler);

        operation.perform();
    }
}
