package com;

import java.io.Serializable;

public class ListEntry implements Serializable {
    private String medicine;
    private boolean isTaken;
    private int time;

    public ListEntry(String medicine) {
        this.medicine = medicine;
        isTaken = false;
        time = -1;
    }

    public void takeIt(int time) {
        try{
        if (time >= 0 && time<= 24) {
            this.time = time;
            isTaken = true;
            }
        else{
                com.DialogLibrary.showWrongTimeDialog();
            }

        }catch (IllegalArgumentException exception) {
        }
    }

    public String getMedicine() {
        return medicine;
    }

    @Override
    public String toString() {
        return medicine + " * " + timeToString();
    }

    public String timeToString() {
        if (isTaken) {
            return "You've taken medicine at " + time;
        } else {
            return "Not Taken";
        }
    }
}