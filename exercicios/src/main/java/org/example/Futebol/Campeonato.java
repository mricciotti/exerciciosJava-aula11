package org.example.Futebol;

public interface Campeonato {
    void cadastrarTime(Time time);
    void registrarPartida(String timeCasa, String timeFora, int golsCasa, int golsFora);
    void mostrarClassificacao();
}