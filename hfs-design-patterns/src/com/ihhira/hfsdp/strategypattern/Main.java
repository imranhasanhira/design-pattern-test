package com.ihhira.hfsdp.strategypattern;

import com.ihhira.hfsdp.strategypattern.duck.MallardDuck;

/**
 * created on 10/22/14.
 *
 * @author Md Imran Hasan Hira (hasan.hira@konasl.com)
 */
public class Main {
    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
