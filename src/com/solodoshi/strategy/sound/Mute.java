package com.solodoshi.strategy.sound;

import com.solodoshi.strategy.sound.ISound;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
public class Mute implements ISound {
    @Override
    public void sound() {
        System.out.println("Nothing... nothing");
    }
}
