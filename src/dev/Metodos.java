package dev;

import java.util.ArrayList;

public class Metodos {

//UTILIZAÇÃO:
    public Partido[] criaPartidos() {
        //CRIA OS PARTIDOS, ADICIONA UM CANDIDATO PARA CADA PARTIDO, E RETORNA UMA LISTA COM OS PARTIDOS
        Partido p1 = new Partido("Partido Verde", "11");
        Partido p2 = new Partido("Partido Azul", "22");
        Partido p3 = new Partido("Partido Vermelho", "33");
        Partido p4 = new Partido("Partido Amarelo", "44");        

        p1.adicionarCandidato(new Candidato("Joca", "11123", 0));
        p2.adicionarCandidato(new Candidato("Maria", "22123", 0));
        p3.adicionarCandidato(new Candidato("Luiz", "33123", 0));
        p4.adicionarCandidato(new Candidato("Baiano", "44123", 0));
        
        Partido[] partidos = {p1, p2, p3, p4};

        return partidos;
    }


    public boolean votar(String voto, Partido[] partidos) {
        String numPartido = voto.substring(0, 2);
        Partido partidoVotado = new Partido();
        ArrayList<Candidato> candidatos = new ArrayList<>();

        for (int i = 0; i <= (partidos.length)-1; i++) {
            if (partidos[i].getNumero().equals(numPartido)) {
                partidoVotado = partidos[i];
                candidatos = partidoVotado.getCandidatos();
                break;
            }
            else{
                return false;                
            }
        }
        for (int i = 0; i <= (candidatos.size())-1;i++){
            if (candidatos.get(i).getNumero().equals(voto)){
                candidatos.get(i).adicionaVoto();
                return true;
            }
        }
        return false;        
    }
    
    
}
