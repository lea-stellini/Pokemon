package com.zenikaPoei;

public class Arena {

    public Pokemon pokemon1;
    public Pokemon pokemon2;
    public Arena(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void duel(){

        int pokemon1Pv = pokemon1.getPv();
        int pokemon2Pv = pokemon2.getPv();

        while(pokemon1Pv > 0 && pokemon2Pv > 0){
            pokemon2Pv -= getAttack(pokemon1, pokemon2);
            pokemon1Pv -= getAttack(pokemon2, pokemon1);
        }

        if(pokemon1Pv > 0){
            System.out.printf("%s a remporté le duel !", pokemon1.getClass().getSimpleName());
        }else if(pokemon2Pv > 0){
            System.out.printf("%s a remporté le duel !", pokemon2.getClass().getSimpleName());
        }else{
            System.out.println("Et c'est un match nul !");
        }
    }

    public int getAttack(Pokemon pokemon1, Pokemon pokemon2){
        return pokemon1.isStrongerAgainstType(pokemon2.getType()) ?
                pokemon1.specialAttack() :
                pokemon1.attack();
    }
}
