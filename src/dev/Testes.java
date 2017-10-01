package dev;

import UI.InterfaceUrna;
import javax.swing.*;

public class Testes {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfaceUrna gui = new InterfaceUrna();
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(gui);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
