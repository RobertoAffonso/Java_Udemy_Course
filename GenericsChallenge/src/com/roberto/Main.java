package com.roberto;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<Team> teams = new ArrayList<>();
//        Collections.sort(teams);

        Player beckham = new SoccerPlayer("Beckham");
        Player lebron = new BasketballPlayer("LeBron");

        Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
        Team<SoccerPlayer> vasco = new Team<>("Vasco da Gama");
        Team<BasketballPlayer> bulls = new Team("Chicago Bulls");

        flamengo.addPlayer(beckham);
        flamengo.numPlayers();


    }
}
