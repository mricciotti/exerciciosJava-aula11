package org.example.Pedagio;
import java.util.*;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<Veiculo> historico;
    private double totalArrecadado;

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
        this.historico = new ArrayList<>();
        this.totalArrecadado = 0;
    }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio(tarifaBase);
        historico.add(veiculo);
        totalArrecadado += valor;
        System.out.println("Veículo " + veiculo.getPlaca() + " (" + veiculo.getTipo() + ") pagou R$ " + valor);
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Veiculo> getHistorico() {
        return historico;
    }
}
