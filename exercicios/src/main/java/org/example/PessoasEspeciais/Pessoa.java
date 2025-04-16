package org.example.PessoasEspeciais;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grau;
    private String endereco;
    private List<Atendimento> atendimentos;

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grau, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grau = grau;
        this.endereco = endereco;
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public String getGrau() {
        return grau;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - " + tipoDeficiencia + " (" + grau + ")";
    }
}
