package com.roberto;

class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String plot()
    {
        return "No plot here";
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }

    @Override
    public String plot()
    {
        return "A shark eats people";
    }
}

class Equilibrium extends Movie
{
    public Equilibrium()
    {
        super("Equilibrium");
    }

    @Override
    public String plot()
    {
        return "A cleric shoots a lot of bad guys";
    }
}

class Alien extends Movie
{
    public Alien()
    {
        super("Alien");
    }

    @Override
    public String plot()
    {
        return "An Alien hunts and kills the passengers of the commercial vessel Nostromo";
    }
}

class DieHard extends Movie
{
    public DieHard()
    {
        super("Die Hard");
    }

    @Override
    public String plot()
    {
        return "Policeman John McClane shoots at terrorists after a hostile takeover at Nakatomi Plaza";
    }
}

class TheMatrix extends Movie
{
    public TheMatrix()
    {
        super("The Matrix");
    }

    @Override
    public String plot()
    {
        return "Humans try to survive in an alternate reality controlled by machines";
    }
}

class ForgettableMovie extends Movie
{
    public ForgettableMovie()
    {
        super("Forgettable Movie");
    }
}

public class Main
{
    public static void main(String[] args)
    {
	// write your code here
    }

    public static Movie randomMovie()
    {
        int rand = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated is: " + rand);

        switch (rand)
        {
            case 1:
                return new Jaws();

            case 2:
                return new Equilibrium();

            case 3:
                return new Alien();

            case 4:
                return new DieHard();

        }
    }
}
