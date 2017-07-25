package com.idtech.zevgoldhabergordon.random_monster_generator;

/**
 * Created by idstudent on 7/19/17.
 */

public class Monster {
    public String name;
    public int health;
    public int damage;
    public int armor;
    public String description;
    public String powers;
    public String notes;
    public int e;
    public int p;
    public int numEnemies;

    public Monster(String name, int health, int damage, int armor, String description, String powers, String notes, int e, int p, int numEnemies){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.description = description;
        this.powers = powers;
        this.notes = notes;
        this.e = e;
        this.p = p;
        this.numEnemies = numEnemies;
    }
    String convertArmor(int armor){
        String temp = "None";
        this.armor = armor;
            if (armor <= 0) {
                temp = "None";
            }
            else if(armor == 1) {
                temp = "Leather";
            }
            else if(armor ==2) {
                temp = "Chainmail";
            }
            else if(armor == 3) {
                temp = "Halfplate";
            }
            else {
                temp = "Fullplate";
            }
        return temp;
    }


}
