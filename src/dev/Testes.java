package dev;

import UI.InterfaceUrna;
import javax.swing.*;

public class Testes {

    public static void main(String[] args) {
        //Partido[] partidos = new Metodos().criaPartidos();       
        //System.out.println(new Metodos().votar("11123", partidos));
        //System.out.println(partidos[0].getCandidatos().get(0).getNumVotos());

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
