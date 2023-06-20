package br.com.projp2.projtask.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "usuarioDB")
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    private String id;
    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
