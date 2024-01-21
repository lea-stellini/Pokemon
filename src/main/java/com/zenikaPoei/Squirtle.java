package com.zenikaPoei;

public class Squirtle extends Pokemon{
    public final static int POKEDEX_INDEX = 7;

    public Squirtle (){
        this(1);
    }

    public Squirtle(int level) {
        super(level);
    }

    public void shout(){
        System.out.println("Carapuce !!");
    }

    public void surf(){
        System.out.println("Squirtle se met à nager !");
    }
}
