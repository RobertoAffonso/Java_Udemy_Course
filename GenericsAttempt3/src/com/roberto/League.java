package com.roberto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Roberto Affonso, created on 14/03/18
 **/

public class League<T extends Team>
{
    private String name;
    private List<T> league;

    public League(String name)
    {
        this.name = name;
        league = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public boolean addTeamToLeague(T team)
    {
        if(league.contains(team))
        {
            System.out.println("Team already exists in the league.");
            return false;
        }

        league.add(team);
        System.out.println(team.getName() + " Added to the current " + this.getName());
        return true;
    }

    public boolean displayRanking()
    {
        if(this.league.isEmpty())
        {
            System.out.println("There are no teams added to the current league.");
            return false;
        }
        else
        {
            int i = 1;
            Collections.sort(this.league);
            for(T team : league)
            {
                System.out.println(i  + " " + team.getName() + " : " + team.ranking());
                i++;
            }
            return true;

        }
    }
}
