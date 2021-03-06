package com.ihhira.hfsdp.strategypattern.quack;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }

}
