package br.com.projp2.projtask.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Metas {
    private String descricao;
    private int prioridade;
    private boolean concluida;

    public Metas(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }
}
