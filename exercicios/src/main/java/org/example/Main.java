package org.example;

import org.example.Futebol.Campeonato;
import org.example.Futebol.CampeonatoImpl;
import org.example.Futebol.Jogadora;
import org.example.Futebol.Time;
import org.example.Pedagio.*;
import org.example.PessoasEspeciais.Atendimento;
import org.example.PessoasEspeciais.Pessoa;
import org.example.PessoasEspeciais.SistemaAtendimentoImpl;

//public class Main {
//    public static void main(String[] args) {
//        Campeonato campeonato = new CampeonatoImpl();
//
//        Time time1 = new Time("As Panteras", "São Paulo");
//        time1.adicionarJogadora(new Jogadora("Clara", 22, "Atacante", 9));
//        time1.adicionarJogadora(new Jogadora("Lia", 24, "Goleira", 1));
//
//        Time time2 = new Time("Feras do Norte", "Manaus");
//        time2.adicionarJogadora(new Jogadora("Maya", 20, "Meia", 8));
//        time2.adicionarJogadora(new Jogadora("Jéssica", 25, "Zagueira", 5));
//
//        campeonato.cadastrarTime(time1);
//        campeonato.cadastrarTime(time2);
//
//        campeonato.registrarPartida("As Panteras", "Feras do Norte", 2, 1);
//        campeonato.registrarPartida("Feras do Norte", "As Panteras", 1, 1);
//
//        campeonato.mostrarClassificacao();
//    }
//}


//import java.time.LocalDate;
//
//public class Main {
//    public static void main(String[] args) {
//        SistemaAtendimentoImpl sistema = new SistemaAtendimentoImpl();
//
//        Pessoa p1 = new Pessoa("Carla", 30, "Visual", "Moderado", "Rua A");
//        Pessoa p2 = new Pessoa("João", 25, "Auditiva", "Leve", "Rua B");
//
//        sistema.cadastrarPessoa(p1);
//        sistema.cadastrarPessoa(p2);
//
//        sistema.cadastrarAtendimento("Carla", new Atendimento(LocalDate.of(2025, 4, 1), "Fisioterapia", "Dra. Ana"));
//        sistema.cadastrarAtendimento("Carla", new Atendimento(LocalDate.of(2025, 4, 8), "Psicologia", "Dr. Bruno"));
//        sistema.cadastrarAtendimento("João", new Atendimento(LocalDate.of(2025, 4, 5), "Terapia Ocupacional", "Dra. Clara"));
//
//        System.out.println("\n Pessoas com deficiência visual:");
//        sistema.filtrarPorDeficiencia("Visual").forEach(System.out::println);
//
//        System.out.println("\n Relatório de atendimentos da Carla:");
//        sistema.gerarRelatorioAtendimentos("Carla");
//    }
//}



public class Main {
    public static void main(String[] args) {
        ControlePedagio controle = new ControlePedagio();

        PracaPedagio spAnhanguera = new PracaPedagio("SP - Anhanguera", 8.50);
        PracaPedagio spImigrantes = new PracaPedagio("SP - Imigrantes", 10.00);

        controle.adicionarPraca(spAnhanguera);
        controle.adicionarPraca(spImigrantes);

        Veiculo v1 = new Carro("ABC-1234");
        Veiculo v2 = new Moto("XYZ-9876");
        Veiculo v3 = new Caminhao("DEF-4567", 4);

        spAnhanguera.registrarPassagem(v1);
        spAnhanguera.registrarPassagem(v3);
        spImigrantes.registrarPassagem(v2);

        controle.gerarRelatorios();
    }
}
