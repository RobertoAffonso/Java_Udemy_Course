package com.roberto;

/**
 * @author Roberto Affonso, created on 29/12/17
 **/

public class Hamburger
{
    private String breadRoll;
    private String meat;
    private double basePrice;
    private int numberOfHamburgers;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;

    public Hamburger(String breadRoll, String meat)
    {
        this.breadRoll = breadRoll;
        this.meat = meat;
        basePrice = 30;
    }

    public Hamburger(String breadRoll, String meat, String addition1)
    {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
    }

    public Hamburger(String breadRoll, String meat, String addition1, String addition2)
    {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
    }

    public Hamburger(String breadRoll, String meat, String addition1, String addition2, String addition3)
    {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
    }

    public Hamburger(String breadRoll, String meat, String addition1, String addition2, String addition3, String addition4)
    {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public String getBreadRoll()
    {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll)
    {
        this.breadRoll = breadRoll;
    }

    public String getMeat()
    {
        return meat;
    }

    public void setMeat(String meat)
    {
        this.meat = meat;
    }

    public double getBasePrice()
    {
        return basePrice;
    }

    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }

    public String getAddition1()
    {
        return addition1;
    }

    public void setAddition1(String addition1)
    {
        this.addition1 = addition1;
    }

    public String getAddition2()
    {
        return addition2;
    }

    public void setAddition2(String addition2)
    {
        this.addition2 = addition2;
    }

    public String getAddition3()
    {
        return addition3;
    }

    public void setAddition3(String addition3)
    {
        this.addition3 = addition3;
    }

    public String getAddition4()
    {
        return addition4;
    }

    public void setAddition4(String addition4)
    {
        this.addition4 = addition4;
    }
}
