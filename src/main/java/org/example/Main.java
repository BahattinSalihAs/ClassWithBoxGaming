package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter semra = new Fighter("Semra",22,140,115,50);
        Fighter salih = new Fighter("Salih",15,100,85,50);

        Match m1 = new Match(semra,salih,120,80);
        m1.fight();

    }
}