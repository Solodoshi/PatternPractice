package com.solodoshi.strategy;

import com.solodoshi.strategy.ducks.Duck;
import com.solodoshi.strategy.ducks.RubberDuck;
import com.solodoshi.strategy.ducks.SuperDuck;

/**
 * Created with IntelliJ IDEA.
 * User: foxberry
 * Date: 18.11.13
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class DuckPerformance {

    public static void main(String args[]) {
        Duck kachka = new RubberDuck();
        kachka.fly();
        kachka.makeSound();

        Duck dyvoKachur = new SuperDuck();
        dyvoKachur.fly();
        dyvoKachur.makeSound();


    }
}
