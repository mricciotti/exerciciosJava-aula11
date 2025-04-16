package org.example.Pedagio;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int eixos) {
        super(placa, "Caminhão");
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase * eixos;
    }
}
