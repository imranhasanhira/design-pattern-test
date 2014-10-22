package com.ihhira.hfsdp.strategypattern.duck;

import com.ihhira.hfsdp.strategypattern.fly.FlyNoWay;
import com.ihhira.hfsdp.strategypattern.quack.MuteQuack;
import com.ihhira.hfsdp.strategypattern.quack.Squeak;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class RubberDuck extends Duck {
    RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Rubber duck");
    }
}
