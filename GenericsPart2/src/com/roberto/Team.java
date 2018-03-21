package com.roberto;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 15/01/18
 **/

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " already exists.");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() + " Added to team");
            return true;
        }
    }

    public int numPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;

        if(ourScore > theirScore){
            message = " beat ";
            won++;
        }
        else if(ourScore < theirScore){
            message = " lost to ";
            lost++;
        }
        else{
            message = " drew with ";
            tied++;
        }
        played++;

        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }
        else if(this.ranking() < team.ranking()){
            return 1;
        }
        else {
            return 0;
        }
    }
}
