package com.zenikaPoei;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon bulle = new Bulbasaur(10);
        Squirtle squirtle = new Squirtle();
        Pokemon charmander = new Charmander(50);

        bulle.attack();
        System.out.println(bulle.toString());
        bulle.shout();

        squirtle.attack();
        System.out.println(squirtle.toString());
        squirtle.shout();
        squirtle.surf();

        charmander.attack();
        System.out.println(charmander.toString());
        charmander.shout();
    }
}