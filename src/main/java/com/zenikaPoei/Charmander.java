package com.zenikaPoei;

public class Charmander extends Pokemon{

    public final static int POKEDEX_INDEX = 4;

    public Charmander (){
        this(1);
    }
    public Charmander(int level) {
        super(level);
    }

    public void shout(){
        System.out.println("Salamèche !!");
    }
}
