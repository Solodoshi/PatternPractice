package com.solodoshi.strategy.ducks;

import com.solodoshi.strategy.flight.EagleStyle;
import com.solodoshi.strategy.sound.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */
public class SuperDuck extends Duck {
    public SuperDuck(){
        sound =new Quack();
        flight = new EagleStyle();
    }
}
