package com.zenikaPoei;

import java.util.Random;

public class Bulbasaur extends Pokemon implements Grass{
    public final static int POKEDEX_INDEX = 1;

    public Bulbasaur (){
        this(1);
    }

    public Bulbasaur(int level) {
        super(level);
    }

    public void shout(){
        System.out.println("Bulbizare !!");
    }

    @Override
    public ElementTypes getType() {
        return ElementTypes.GRASS;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        return type == ElementTypes.WATER;
    }

    @Override
    public int specialAttack() {
        return leafBlade();
    }

    @Override
    public int leafBlade() {
        Random random = new Random();
        return random.nextInt(10, 20);
    }
}
