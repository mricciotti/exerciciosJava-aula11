package org.example.PessoasEspeciais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaAtendimentoImpl implements SistemaAtendimento {
    private List<Pessoa> pessoas;

    public SistemaAtendimentoImpl() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa buscarPessoaPorNome(String nome) {
        return pessoas.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public void cadastrarAtendimento(String nomePessoa, Atendimento atendimento) {
        Pessoa pessoa = buscarPessoaPorNome(nomePessoa);
        if (pessoa != null) {
            pessoa.adicionarAtendimento(atendimento);
        }
    }

    @Override
    public List<Pessoa> filtrarPorDeficiencia(String tipo) {
        return pessoas.stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    @Override
    public List<Pessoa> filtrarPorGrau(String grau) {
        return pessoas.stream()
                .filter(p -> p.getGrau().equalsIgnoreCase(grau))
                .collect(Collectors.toList());
    }

    @Override
    public void gerarRelatorioAtendimentos(String nomePessoa) {
        Pessoa pessoa = buscarPessoaPorNome(nomePessoa);
        if (pessoa != null) {
            System.out.println("Relatório de atendimentos para " + pessoa.getNome() + ":");
            for (Atendimento atendimento : pessoa.getAtendimentos()) {
                System.out.println(" - " + atendimento);
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
