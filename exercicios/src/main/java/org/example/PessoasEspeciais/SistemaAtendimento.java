package org.example.PessoasEspeciais;

import java.util.List;

public interface SistemaAtendimento {
    List<Pessoa> filtrarPorDeficiencia(String tipo);
    List<Pessoa> filtrarPorGrau(String grau);
    void gerarRelatorioAtendimentos(String nomePessoa);
}
