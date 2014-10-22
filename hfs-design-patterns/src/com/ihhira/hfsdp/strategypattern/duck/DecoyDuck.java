package com.ihhira.hfsdp.strategypattern.duck;

import com.ihhira.hfsdp.strategypattern.fly.FlyNoWay;
import com.ihhira.hfsdp.strategypattern.quack.MuteQuack;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class DecoyDuck extends Duck {
    DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
