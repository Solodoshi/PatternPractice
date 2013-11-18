package com.solodoshi.strategy.ducks;

import com.solodoshi.strategy.flight.CantFly;
import com.solodoshi.strategy.flight.EagleStyle;
import com.solodoshi.strategy.sound.Mute;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class RubberDuck extends Duck {
   public RubberDuck(){
       sound =new Mute();
       flight = new CantFly();
   }
}
