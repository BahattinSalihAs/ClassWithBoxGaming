package org.example;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    public Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void fight(){
        int random = (int) (Math.random()*100);
        while (this.f1.health > 0 && this.f2.health > 0){
            if ((this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight)){
                if (random > 50){
                    System.out.println("========== YENİ ROUND ==========");
                    this.f1.movement(this.f2);
                    this.f2.movement(this.f1);
                    if (this.f1.isDodge()){
                        this.f1.health += f2.damage;
                        System.out.println(f1.name + " hasar blokladı.");
                    }
                    if (this.f2.isDodge()){
                        this.f2.health += f1.damage;
                        System.out.println(f2.name + " hasar blokladı.");
                    }
                    if (this.f1.health <= 0){
                        this.f1.health =0;
                        System.out.println(this.f2.name + " kazandı.");
                    }
                    else if (this.f2.health <= 0){
                        this.f2.health =0;
                        System.out.println(this.f1.name + " kazandı.");
                    }
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                }
                if (random <= 50){
                    System.out.println("========== YENİ ROUND ==========");
                    this.f2.movement(this.f1);
                    this.f1.movement(this.f2);
                    if (this.f1.isDodge()){
                        this.f1.health += f2.damage;
                        System.out.println(f1.name + " hasar blokladı.");
                    }
                    if (this.f2.isDodge()){
                        this.f2.health += f1.damage;
                        System.out.println(f2.name + " hasar blokladı.");
                    }
                    if (this.f1.health <= 0){
                        this.f1.health =0;
                        System.out.println(this.f2.name + " kazandı.");
                    }
                    else if (this.f2.health <= 0){
                        this.f2.health =0;
                        System.out.println(this.f1.name + " kazandı.");
                    }
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);

                }




            }else {
                System.out.println("Sporcuların sikletleri uyuşmuyor...");
                break;
            }
        }
    }
}
