package org.example.rpg;

import org.example.utils.Constant;

public class Troll extends Monster implements  Bleedable, Poisonable{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public Troll() {
    }

    @Override
public double bleed(){
return getDamage()+Constant.BLEED_PERCENTAGE;
}
@Override
public double bleed(int level){
    return level*getDamage()* Constant.BLEED_PERCENTAGE;
}
@Override
    public double attack(){
    return getDamage() + bleed() + poison();
}
@Override
    public  double poison(){
    return getDamage() * Constant.POISON_PERCENTAGE;
}
}
