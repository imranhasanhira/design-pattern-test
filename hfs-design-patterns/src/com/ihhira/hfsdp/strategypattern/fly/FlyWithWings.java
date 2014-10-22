package com.ihhira.hfsdp.strategypattern.fly;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
