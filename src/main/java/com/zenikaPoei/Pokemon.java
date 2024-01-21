package com.zenikaPoei;

import java.util.Random;

public abstract class Pokemon implements ElementType {
    private final static int PV_NUMBER_CALCUL = 5;
    private int level;
    private int pv;

    public Pokemon (){
        this(1);
    }

    public Pokemon(int level) {
        this.level = level;
        this.pv = level * PV_NUMBER_CALCUL;
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public int getPv() {
        return pv;
    }

    private void setPv(int pv) {
        this.pv = pv;
    }

    public int attack(){
        Random random = new Random();
        int attackPower = random.nextInt(10);

        if(attackPower == 0){
            System.out.println("Pokemon a raté son attaque...");
        } else {
            System.out.printf("Pokemon attaque avec une intensité de %s%n", attackPower);
        }

        return attackPower;
    }

    public abstract void shout();

    @Override
    public String toString() {
        return String.format("%s de niveau %s a %sPV.", this.getClass().getSimpleName(), this.getLevel(), this.getPv());
    }
}
