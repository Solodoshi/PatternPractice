package com.solodoshi.strategy.ducks;

import com.solodoshi.strategy.flight.IFlight;
import com.solodoshi.strategy.sound.ISound;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {
    ISound sound;
    IFlight flight;


   public void makeSound(){
        sound.sound();
    }
   public void fly(){
        flight.fly();
    }
}
