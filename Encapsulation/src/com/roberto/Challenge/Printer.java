package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Printer
{
    private int numberPages;
    private int tonerLevel = 100;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter)
    {
        if(tonerLevel > 0 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;

        this.numberPages = 0;
    }

    public void print()
    {
        System.out.println("Starting up printer...");
        if(tonerLevel <= 0)
        {
            System.out.println("Low toner level");
        }
        else if(isDuplexPrinter() == true)
        {
            System.out.println("Printing.....");

            if((tonerLevel - 25) < 0)
            {
                System.out.println("Insufficient toner level to complete printing");
            }
            this.numberPages+=2;
            this.tonerLevel -= 25;
            System.out.println("Printing has been completed");
        }
        else
        {
            System.out.println("Printing.....");

            if((tonerLevel - 20) < 0)
            {
                System.out.println("Insufficient toner level to complete printing");
            }
            this.numberPages++;
            this.tonerLevel -= 20;
            System.out.println("Printing has been completed");
        }

        System.out.println("Total number of printed pages: " + getNumberPages());
        System.out.println("Current toner level: " + getTonerLevel());
    }

    public void fillUpToner(int toner)
    {
        if((tonerLevel + toner) > 100)
        {
            System.out.println("Toner level overflow");
        }
        else
        {
            this.tonerLevel += toner;
            System.out.println("Toner fill up complete");
        }

        System.out.println("Current toner level: " + getTonerLevel());
    }

    private int getNumberPages()
    {
        return this.numberPages;
    }

    private int getTonerLevel()
    {
        return this.tonerLevel;
    }

    private boolean isDuplexPrinter()
    {
        return this.duplexPrinter;
    }
}
