package com.behnam;

import javax.swing.*;

/**
* This is the Main class for our app
* @author Behnam
* @version 1.0
*/
public class Main {
    /**
    * This is the main method
    * @param args The given argument to the console
    */
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        CalculatorGUI calculatorGUI = new CalculatorGUI();
    }
}