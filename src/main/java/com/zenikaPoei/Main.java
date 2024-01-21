package com.zenikaPoei;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bulbasaur bulle = new Bulbasaur(10);

        bulle.attack();
        System.out.println(bulle.toString());

    }
}