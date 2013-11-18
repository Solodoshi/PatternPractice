package com.solodoshi.strategy.sound;

import com.solodoshi.strategy.sound.ISound;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class Quack implements ISound {
    @Override
    public void sound() {
        System.out.println("quack i said");
    }
}
