package br.com.projp2.projtask.Service;


import br.com.projp2.projtask.Model.Task;
import br.com.projp2.projtask.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task criarTarefa(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> obterTodasTarefas() {
        return taskRepository.findAll();
    }

    public Optional<Task> obterTarefaPorId(String id) {
        return taskRepository.findById(id);
    }

    public Task atualizarTarefa(Task task) {
        return taskRepository.save(task);
    }

    public void excluirTarefa(String id) {
        taskRepository.deleteById(id);
    }
}
