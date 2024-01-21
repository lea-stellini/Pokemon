package com.zenikaPoei;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon bulle = new Bulbasaur(50);
        Pokemon squirtle = new Squirtle(48);
        Pokemon charmander = new Charmander(50);

        Arena blueArena = new Arena(bulle, charmander);

        blueArena.duel();
    }
}