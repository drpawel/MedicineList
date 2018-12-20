package com;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashMap;

public class ListEntry implements Serializable
{
    private String medicine;
    private boolean isTaken;
    private int pills;
    public String time;
    public ListEntry(String medicine)
    {
        this.medicine = medicine;
        isTaken = false;
    }

    public void takeIt(int pills)
    {
            this.pills = pills;
            isTaken = true;
    }
    
    public void getTime(String time)
    {
    	this.time=LocalTime.now().toString();
    }
    public String getMedicine()
    {
        return medicine;
    }

    @Override
    public String toString()
    {
        return medicine + " * " +pillsToString();
    }

    public String pillsToString()
    {
        if (isTaken)
        {
            return "You've taken " + pills + " pills at " + LocalTime.now();
        } else
        {
            return "Not Taken";
        }
    }
}