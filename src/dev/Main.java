package dev;

public class Main {
    public static void main (String [] args){
        Partido[] partidos = new Metodos().criaPartidos();
        
        System.out.println(new Metodos().votar("11123", partidos));
        System.out.println(partidos[0].getCandidatos().get(0).getNumVotos());        
    }
}
