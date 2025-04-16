package org.example.Pedagio;

public class Carro extends Veiculo {
    public Carro(String placa) {
        super(placa, "Carro");
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase;
    }
}