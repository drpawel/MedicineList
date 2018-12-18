package com;

import javax.swing.*;

public class DialogLibrary {
    public static void showNotSelectedDialog() {
        JOptionPane.showMessageDialog(null,
                "You have not selected anything!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void showEmptyInputDialog() {
        JOptionPane.showMessageDialog(null,
                "Your input was empty!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
    }

 //   public static void showStatusMedicineDialog() {
 //       Object[] options = {"Taken",
 //               "Not taken"};
 //       JOptionPane.showOptionDialog(frame,
 //              "Have you take this medicine?",
 //              "Status of medicine",
 //               JOptionPane.YES_NO_OPTION,
 //               JOptionPane.QUESTION_MESSAGE,
 //               null,
 //               options,
 //               options[2]);
 //   }
//nie wiem dlaczego ale nie chce użyć tego frame 

    public static String showTimeInputDialog() {
        return JOptionPane.showInputDialog(null, "At what time have you take your medicine?");
    }

    public static String showProductInputDialog() {
        return JOptionPane.showInputDialog(null, "What medicine you want to add?");
    }

    //tutaj żeby wywalało to okno Taken Not taken
}
// TO DO żeby były przyciski w środku tego a nie że wprowadzamy tekst
