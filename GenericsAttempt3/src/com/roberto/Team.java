package com.roberto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Affonso, created on 14/03/18
 **/

public class Team<T extends Player> implements Comparable<Team<T>>
{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private List<Player> members = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName() + " is already on the team");
            return false;
        }
        else
        {
            members.add(player);
            System.out.println(player.getName() + " has been added to the team: " + this.getName());
            return true;
        }
    }

    public int numPlayers()
    {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        String message;
        if(ourScore > theirScore)
        {
            message = " won a match against: ";
            this.won++;
        }
        else if(ourScore < theirScore)
        {
            message = " lost a match against: ";
            this.lost++;
        }
        else
        {
            message = " drew with: ";
            this.tied++;
        }
        played++;
        if(opponent != null)
        {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking()
    {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team)
    {
        if(this.ranking() > team.ranking())
        {
            return -1;
        }
        else if(this.ranking() < team.ranking())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
