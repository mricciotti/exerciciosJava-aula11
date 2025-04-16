package org.example.PessoasEspeciais;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaAtendimentoTest {

    @Test
    public void testCadastroPessoa() {
        SistemaAtendimento sistema = new SistemaAtendimentoImpl();
        Pessoa p = new Pessoa("Carlos", 40, "Motora", "Severo", "Rua Z");
        sistema.cadastrarPessoa(p);
        List<Pessoa> filtrado = sistema.filtrarPorTipo("Motora");

        assertEquals(1, filtrado.size());
        assertEquals("Carlos", filtrado.get(0).getNome());
    }

    @Test
    public void testFiltroPorGrau() {
        SistemaAtendimento sistema = new SistemaAtendimentoImpl();
        sistema.cadastrarPessoa(new Pessoa("Maria", 33, "Mental", "Moderado", "Av. X"));
        sistema.cadastrarPessoa(new Pessoa("Julia", 28, "Mental", "Leve", "Av. Y"));

        List<Pessoa> resultado = sistema.filtrarPorGrau("Moderado");

        assertEquals(1, resultado.size());
        assertEquals("Maria", resultado.get(0).getNome());
    }

    @Test
    public void testRegistroDeAtendimento() {
        SistemaAtendimento sistema = new SistemaAtendimentoImpl();
        Pessoa p = new Pessoa("Beatriz", 29, "Visual", "Leve", "Rua Central");
        sistema.cadastrarPessoa(p);

        Atendimento at = new Atendimento(LocalDate.now(), "Fonoaudiologia", "Dr. Pedro");
        sistema.registrarAtendimento("Beatriz", at);

        assertEquals(1, p.getAtendimentos().size());
        assertEquals("Dr. Pedro", p.getAtendimentos().get(0).getResumo().split(" com ")[1]);
    }
}

