package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Main
{
    public static void main(String[] args)
    {
        Printer printer1 = new Printer(100, false);
        printer1.print();
        printer1.fillUpToner(10);

        Printer printer2 = new Printer(100, true);
        printer2.print();
        printer2.fillUpToner(20);
    }
}
