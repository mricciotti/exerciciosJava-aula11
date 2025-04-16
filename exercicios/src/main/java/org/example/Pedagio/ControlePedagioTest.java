package org.example.Pedagio;

import org.example.Pedagio.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlePedagioTest {

    @Test
    public void testValorMoto() {
        Veiculo moto = new Moto("ABC-0001");
        assertEquals(2.5, moto.calcularPedagio(5.0));
    }

    @Test
    public void testValorCaminhao() {
        Veiculo caminhao = new Caminhao("DEF-2222", 4);
        assertEquals(40.0, caminhao.calcularPedagio(10.0));
    }

    @Test
    public void testRegistroDeVeiculosNaPraca() {
        PracaPedagio praca = new PracaPedagio("SP - Dutra", 7.0);
        Veiculo carro = new Carro("JKL-3333");

        praca.registrarPassagem(carro);
        assertEquals(7.0, praca.getTotalArrecadado());
        assertEquals(1, praca.getHistorico().size());
    }
}
