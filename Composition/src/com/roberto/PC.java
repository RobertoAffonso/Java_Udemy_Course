package com.roberto;

/**
 * @author Roberto Affonso
 **/

public class PC
{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void PowerUP()
    {
        theCase.pressPowerButton();
        drawLogo();
        loadProgram();

    }

    private void drawLogo()
    {
        monitor.drawPixel(1600, 900, "Green");

    }

    private void loadProgram()
    {
        motherboard.loadProgram("LinuxMint");
    }

}
