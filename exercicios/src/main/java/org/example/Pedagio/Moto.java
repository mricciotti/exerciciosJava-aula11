package org.example.Pedagio;

public class Moto extends Veiculo {
    public Moto(String placa) {
        super(placa, "Moto");
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase * 0.5;
    }
}