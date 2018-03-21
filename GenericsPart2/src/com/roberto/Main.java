package com.roberto;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer john = new SoccerPlayer("John");

        Team<FootballPlayer> flamengo = new Team<>("Flamengo");
        flamengo.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicaco Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Botafogo");
        soccerTeam.addPlayer(john);

        Team<FootballPlayer> gremio = new Team<>("Grêmio");
        FootballPlayer pele = new FootballPlayer("Pelé");
        gremio.addPlayer(pele);

        Team<FootballPlayer> palmeiras = new Team<>("Palmeiras");
        Team<FootballPlayer> corinthians = new Team<>("Corinthians");

        gremio.matchResult(flamengo, 7, 1);
        gremio.matchResult(corinthians, 1, 0);

        flamengo.matchResult(palmeiras, 0, 1);
        flamengo.matchResult(gremio, 1, 2);

        System.out.println(flamengo.numPlayers());

        System.out.println("Ranking");
        System.out.println(flamengo.getName() + ": " + flamengo.ranking());
        System.out.println(gremio.getName() + ": " + gremio.ranking());
        System.out.println(palmeiras.getName() + ": " + palmeiras.ranking());
        System.out.println(corinthians.getName() + ": " + corinthians.ranking());

        ArrayList<Team> teams = new ArrayList<>();
        Collections.sort(teams);
    }
}
