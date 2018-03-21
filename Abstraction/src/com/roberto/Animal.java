package com.roberto;

/**
 * @author Roberto Affonso, created on 11/01/18
 **/

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void breathe();
}
