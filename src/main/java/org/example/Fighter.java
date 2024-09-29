package org.example;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int movement(Fighter rival){
        this.health -= rival.damage;
        System.out.println(rival.name + " => " + this.name + " " + rival.damage + " hasar verdi.");
        return this.health;
    }

    boolean isDodge(){
        double randomValue = Math.random()*100;
        return dodge >= randomValue;
    }
}










