package dev;

import java.util.ArrayList;

public class Partido {

    public String nome;
    public String numero;
    public int votosPartido;
    private ArrayList<Candidato> candidatos = new ArrayList<>();

    public Partido(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Partido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public boolean adicionarCandidato(Candidato candidato) {
        return candidatos.add(candidato);
    }
}
