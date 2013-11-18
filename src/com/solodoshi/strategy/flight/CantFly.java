package com.solodoshi.strategy.flight;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class CantFly implements IFlight {
    @Override
    public void fly() {
        System.out.println("too fat to fly");
    }
}
