package com;

import javax.swing.*;

public class DialogLibrary
{
    public static void showNotSelectedDialog()
    {
        JOptionPane.showMessageDialog(null,
                "You have not selected anything!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void showEmptyInputDialog()
    {
        JOptionPane.showMessageDialog(null,
                "Your input was empty!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
    }
    
    public static String showPillsInputDialog()
    {
        return JOptionPane.showInputDialog(null, "How many pills have You taken?");
    }

    public static String showProductInputDialog()
    {
        return JOptionPane.showInputDialog(null, "What medicine you want to add?");
    }

    public static Integer showTakenDialog()
    {
    	Object[] options = {"Taken","Not taken"};
        return JOptionPane.showOptionDialog(//JOptionPane.getRootFrame(),
        null,
          	"Have you take this medinie?",
          	"Status of medicine",
          	JOptionPane.YES_NO_OPTION,
           	JOptionPane.QUESTION_MESSAGE,
        null,
             options,
             options [2]);
        }
//pewnie ten Rootframe nie będzie ok ale na razie nic innego nie wymyśle
    //tutaj żeby wywalało to okno Taken Not taken
}
// TO DO żeby były przyciski w środku tego a nie że wprowadzamy tekst
