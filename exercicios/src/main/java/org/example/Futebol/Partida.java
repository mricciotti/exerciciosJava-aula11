package org.example.Futebol;
import java.util.ArrayList;
import java.util.List;

public class Partida {
    private final Time time1;
    private final Time time2;
    private final int golsTime1;
    private final int golsTime2;

    public Partida(Time time1, Time time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        calcularPontuacao();
    }

    private void calcularPontuacao() {
        if (golsTime1 > golsTime2) {
            time1.adicionarPontos(3);
        } else if (golsTime1 < golsTime2) {
            time2.adicionarPontos(3);
        } else {
            time1.adicionarPontos(1);
            time2.adicionarPontos(1);
        }
    }

    public String getResumo() {
        return time1.getNome() + " " + golsTime1 + " x " + golsTime2 + " " + time2.getNome();
    }
}

