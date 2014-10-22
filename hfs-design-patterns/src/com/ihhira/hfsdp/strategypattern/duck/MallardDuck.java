package com.ihhira.hfsdp.strategypattern.duck;

import com.ihhira.hfsdp.strategypattern.fly.FlyWithWings;
import com.ihhira.hfsdp.strategypattern.quack.Quack;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm Mallard Duck");
    }
}
