package com.zenikaPoei;

import java.util.Random;

public class Charmander extends Pokemon implements Fire{

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

    @Override
    public ElementTypes getType() {
        return ElementTypes.FIRE;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        return type == ElementTypes.GRASS;
    }

    @Override
    public int specialAttack() {
        return flame();
    }

    @Override
    public int flame() {
        Random random = new Random();
        int attackPower = random.nextInt(10, 20);
        System.out.printf("%s utilise sont attaque spéciale flame avec une intensité de %s%n", this.getClass().getSimpleName(), attackPower);
        return  attackPower;
    }
}
