package com.company;

public class Main {

    public static void main(String[] args) {
        Uzel main = initSeznam (5);

    }
    public static Uzel initSeznam(int delkaSeznamu){
        Uzel prvniUzel = new Uzel(1);
        Uzel predesliUzel = prvniUzel;
        for (int i = 2; i <= delkaSeznamu; i++) {
        Uzel newUzel = new Uzel(i);
        newUzel.setFront(predesliUzel);
        predesliUzel.setLast(newUzel);
        predesliUzel = newUzel;

        }
        return prvniUzel;

    }
}

