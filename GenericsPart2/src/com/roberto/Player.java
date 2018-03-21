package com.roberto;

/**
 * @author Roberto Affonso, created on 15/01/18
 **/

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
