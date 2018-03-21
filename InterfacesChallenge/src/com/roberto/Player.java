package com.roberto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Affonso, created on 10/01/18
 **/

public class Player implements IChallenge {
    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "scythe";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> saveValues() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitpoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);
        return null;
    }

    @Override
    public void readValues(List<String> saved) {
        if(saved != null && saved.size() > 0){
            this.name = saved.get(0);
            this.hitpoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
            this.weapon = saved.get(3);
        }

    }
}
