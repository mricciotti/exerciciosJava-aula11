package org.example.PessoasEspeciais;

import java.time.LocalDate;

public class Atendimento {
    private LocalDate data;
    private String tipo;
    private String profissional;

    public Atendimento(LocalDate data, String tipo, String profissional) {
        this.data = data;
        this.tipo = tipo;
        this.profissional = profissional;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getProfissional() {
        return profissional;
    }

    @Override
    public String toString() {
        return data + " - " + tipo + " com " + profissional;
    }
}

