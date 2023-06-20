package br.com.projp2.projtask.Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Realizadas {
    private String descricao;
    private LocalDate dataRealizacao;

    public Realizadas(String descricao, LocalDate dataRealizacao) {
        this.descricao = descricao;
        this.dataRealizacao = dataRealizacao;
    }
}
