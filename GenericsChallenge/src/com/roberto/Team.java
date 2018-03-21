package com.roberto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Affonso, created on 15/01/18
 **/

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> playerList;
    private int won;
    private int lost;
    private int tied;

    public Team(String name) {
        this.name = name;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        this.playerList = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public int numPlayers(){
        return playerList.size();
    }

    public boolean addPlayer(T player){
        if(playerList.contains(player)){
            System.out.println(player.getName() + " Already exists in " + this.getName());
            return false;
        }
        else{
            playerList.add(player);
            System.out.println(player.getName() + " added to " + this.getName());
            return true;
        }
    }

    public void printAllPlayers(){
        for (T player : playerList){
            System.out.println(player.getName());
        }
    }
}
