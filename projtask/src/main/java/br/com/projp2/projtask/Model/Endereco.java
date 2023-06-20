package br.com.projp2.projtask.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}
