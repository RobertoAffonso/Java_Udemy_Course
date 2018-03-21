package com.roberto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Affonso, created on 10/01/18
 **/

public class Monster implements IChallenge{
    private String name;
    private int health;
    private int damage;
    private String type;

    public Monster(String name, int health, int damage, String type) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public List<String> saveValues() {
        List<String> values = new ArrayList<String>();
        values.add(1, this.name);
        values.add(2, "" + this.health);
        values.add(3, "" + this.damage);
        values.add(this.type);
        return values;
    }

    @Override
    public void readValues(List<String> values) {
        if(values.size() > 0 && values != null) {
            this.name = values.get(1);
            this.health = Integer.parseInt(values.get(2));
            this.damage = Integer.parseInt(values.get(3));
            this.type = values.get(4);
        }
    }
}
