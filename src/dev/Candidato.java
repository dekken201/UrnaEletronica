package dev;

public class Candidato {

    //ATRIBUTOS:
    String nome;
    String numero;
    int numVotos;

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void adicionaVoto() {
        numVotos++;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", numero=" + numero + ",número de votos: " + numVotos + '}';
    }


    //CONSTRUTOR:
    public Candidato(String nome, String numero, int numVotos) {
        this.nome = nome;
        this.numero = numero;
        this.numVotos = numVotos;
    }

    public Candidato() {
    }

}
