package org.example.Futebol;

import java.util.*;

public class CampeonatoImpl implements Campeonato {
    private Map<String, Time> times;
    private List<Partida> partidas;

    public CampeonatoImpl() {
        times = new HashMap<>();
        partidas = new ArrayList<>();
    }

    @Override
    public void cadastrarTime(Time time) {
        times.put(time.getNome(), time);
    }

    @Override
    public void registrarPartida(String nomeTime1, String nomeTime2, int gols1, int gols2) {
        Time time1 = times.get(nomeTime1);
        Time time2 = times.get(nomeTime2);

        if (time1 == null || time2 == null) {
            System.out.println("Um dos times não está cadastrado.");
            return;
        }

        Partida partida = new Partida(time1, time2, gols1, gols2);
        partidas.add(partida);
    }

    @Override
    public void mostrarClassificacao() {
        List<Time> lista = new ArrayList<>(times.values());
        lista.sort((t1, t2) -> Integer.compare(t2.getPontos(), t1.getPontos()));

        System.out.println("\n=== Classificação ===");
        for (Time t : lista) {
            System.out.println(t.getNome() + " - " + t.getPontos() + " pontos");
        }

        System.out.println("\n=== Histórico de Partidas ===");
        for (Partida p : partidas) {
            System.out.println(p.getResumo());
        }
    }
}
