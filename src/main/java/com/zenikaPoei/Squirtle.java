package com.zenikaPoei;

import java.util.Random;

public class Squirtle extends Pokemon implements Water{
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

    @Override
    public ElementTypes getType() {
        return ElementTypes.WATER;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        return type == ElementTypes.FIRE;
    }

    @Override
    public int specialAttack() {
        return waterGun();
    }

    @Override
    public int waterGun() {
        Random random = new Random();
        int attackPower = random.nextInt(10, 20);
        System.out.printf("%s utilise sont attaque spéciale waterGun avec une intensité de %s%n", this.getClass().getSimpleName(), attackPower);
        return attackPower;
    }
}
