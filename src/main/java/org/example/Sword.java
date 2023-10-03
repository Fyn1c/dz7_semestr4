package org.example;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

    @Override
    public String getType() {
        return "sword";
    }

    @Override
    public int getDamage() {
        return 5;
    }

}
