package com.roberto;

public class Main
{

    public static void main(String[] args)
    {
        SoccerPlayer neymar = new SoccerPlayer("Neymar");
        FootballPlayer tom = new FootballPlayer("Tom Brady");
        BaseballPlayer mike = new BaseballPlayer("Mike Trout");

        Team<BaseballPlayer> angels = new Team<>("Los Angeles Angels");
        Team<SoccerPlayer> paris = new Team<>("Paris Saint-Germain");
        Team<FootballPlayer> patriots = new Team<>("New England Patriots");

        paris.addPlayer(neymar);
        patriots.addPlayer(tom);
        angels.addPlayer(mike);

        System.out.println("Number of players: " + angels.numPlayers());
        System.out.println("Number of players: " + patriots.numPlayers());
        System.out.println("Number of players: " + paris.numPlayers());

        Team<SoccerPlayer> flamengo = new Team<>("Flamengo");
        Team<SoccerPlayer> corinthians = new Team<>("Corinthians");
        Team<SoccerPlayer> palmeiras = new Team<>("Palmeiras");

        flamengo.matchResult(corinthians, 1, 7);
        corinthians.matchResult(palmeiras, 2, 1);
        palmeiras.matchResult(corinthians, 0, 0);

        System.out.println("Rankings");
        System.out.println(corinthians.getName() + " " + corinthians.ranking());
        System.out.println(palmeiras.getName() + " " + palmeiras.ranking());
        System.out.println(flamengo.getName() + " " + flamengo.ranking());
        System.out.println(paris.getName() + " " + paris.ranking());
        System.out.println(patriots.getName() + " " + patriots.ranking());
        System.out.println(angels.getName() + " " + angels.ranking());

        League<Team<SoccerPlayer>> soccerLeague = new League("Soccer League");
        soccerLeague.addTeamToLeague(flamengo);
        soccerLeague.addTeamToLeague(palmeiras);
        soccerLeague.addTeamToLeague(corinthians);

        soccerLeague.displayRanking();
    }
}
