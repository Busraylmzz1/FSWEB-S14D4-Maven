package org.example.rpg;

import org.example.rpg.utils.Constant;

public class Troll extends Monster implements Bleedable,Poisonable {
    public Troll(String name, int hitPoints, double damage){
        super(name,hitPoints,damage);
    }
    @Override
    public double blead(int level) {
        return getDamage()* Constant.BLEED_PERCENTAGE;
    }



    @Override
    public double blead() {
        return getDamage()+blead()+poison();
    }
    @Override
    public double attack() {
        return getDamage() * Constant.POISON_PERCENTAGE;
    }

    @Override
    public double poison() {
        return Poisonable.super.poison();
    }
}
