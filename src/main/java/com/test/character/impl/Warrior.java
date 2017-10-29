package com.test.character.impl;

import com.test.character.AbstractMan;

public class Warrior extends AbstractMan {

    public Warrior(String name, int maxHp, String weapon) {
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.weapon = weapon;
    }

    public String attack() {
        return name + " atakuje z " + weapon;
    }

    public void heal(int hp) {
        if (hp + this.hp >= this.maxHp) {
            this.hp = this.maxHp;
        } else {
            this.hp = hp + this.hp;
        }
    }

    public String status() {
        return this.hp <= 0 ? name + " mówi \"Umarłem.\"" : name + " mówi \"Żyję.\"";
    }

    public void takeDamage(int hp) {
        this.hp = this.hp - hp;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name = '" + name + '\'' +
                ", maxHp = " + maxHp +
                ", hp = " + hp +
                ", weapon = '" + weapon + '\'' +
                '}';
    }
}
