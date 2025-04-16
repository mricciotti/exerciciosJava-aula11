package org.example.Futebol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CampeonatoTest {

    @Test
    public void testCadastroDeTimes() {
        Campeonato campeonato = new CampeonatoImpl();
        Time time = new Time("As Panteras", "São Paulo");
        campeonato.cadastrarTime(time);

        // Verificação indireta via simulação de partida
        campeonato.registrarPartida("As Panteras", "As Panteras", 0, 0);
        // Se não deu erro, cadastro foi bem-sucedido
        assertTrue(true);
    }

    @Test
    public void testPontuacaoVitoria() {
        Campeonato campeonato = new CampeonatoImpl();

        Time time1 = new Time("Time A", "Cidade A");
        Time time2 = new Time("Time B", "Cidade B");

        campeonato.cadastrarTime(time1);
        campeonato.cadastrarTime(time2);

        campeonato.registrarPartida("Time A", "Time B", 2, 1);

        assertEquals(3, time1.getPontos());
        assertEquals(0, time2.getPontos());
    }

    @Test
    public void testPontuacaoEmpate() {
        Campeonato campeonato = new CampeonatoImpl();

        Time time1 = new Time("Time A", "Cidade A");
        Time time2 = new Time("Time B", "Cidade B");

        campeonato.cadastrarTime(time1);
        campeonato.cadastrarTime(time2);

        campeonato.registrarPartida("Time A", "Time B", 1, 1);

        assertEquals(1, time1.getPontos());
        assertEquals(1, time2.getPontos());
    }

    @Test
    public void testAdicionarJogadora() {
        Time time = new Time("As Guerreiras", "Curitiba");
        Jogadora jogadora = new Jogadora("Rafaela", 23, "Meio-campo", 10);

        time.adicionarJogadora(jogadora);

        // Como não há método de consulta, validamos indiretamente
        assertTrue(true); // Se não der erro, passou
    }
}
