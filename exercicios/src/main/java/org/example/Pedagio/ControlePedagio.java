package org.example.Pedagio;

import java.util.*;

public class ControlePedagio {
    private List<PracaPedagio> pracas;

    public ControlePedagio() {
        this.pracas = new ArrayList<>();
    }

    public void adicionarPraca(PracaPedagio praca) {
        pracas.add(praca);
    }

    public void gerarRelatorios() {
        for (PracaPedagio praca : pracas) {
            System.out.println("\n Praça: " + praca.getLocalizacao());
            System.out.println("Total arrecadado: R$ " + praca.getTotalArrecadado());
            System.out.println("Veículos que passaram:");
            for (Veiculo v : praca.getHistorico()) {
                System.out.println(" - " + v.getTipo() + " - Placa: " + v.getPlaca());
            }
        }
    }

    public List<PracaPedagio> getPracas() {
        return pracas;
    }
}