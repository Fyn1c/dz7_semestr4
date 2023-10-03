package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    private Weapon weapon;
    private int health = 100;

    public Player(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player() {

    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void attack() {
        System.out.println("Dealing " + weapon.getDamage() + " damage with " + weapon.getType());
    }
}