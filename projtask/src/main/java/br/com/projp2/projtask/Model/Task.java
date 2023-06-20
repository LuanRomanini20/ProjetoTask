package br.com.projp2.projtask.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "taskDB")
@Getter
@Setter
public class Task implements Serializable {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean processed;
    private boolean requiresProcessing;

    //classe 2
    private Usuario usuario;
    //classe 3
    private Endereco endereco;
    //classe 4
    private Metas metas;
    //classe 5
    private Realizadas realizadas;
    public Task() {
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean getRequiresProcessing() {
        return requiresProcessing;
    }

    public void setRequiresProcessing(boolean requiresProcessing) {
        this.requiresProcessing = requiresProcessing;
    }
}
