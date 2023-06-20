package br.com.projp2.projtask.Controller;

import br.com.projp2.projtask.Model.Task;
import br.com.projp2.projtask.Service.TaskService;
import br.com.projp2.projtask.Rabbit.TaskProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskProducer taskProducer;

    @PostMapping
    public Task criarTarefa(@RequestBody Task task) {
        return taskService.criarTarefa(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.obterTodasTarefas();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable("id") String id) {
        return taskService.obterTarefaPorId(id).orElseThrow();
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable("id") String id, @RequestBody Task task) {
        task.setId(id);
        return taskService.atualizarTarefa(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable("id") String id) {
        taskService.excluirTarefa(id);
    }

    @GetMapping("/testeRabbit")
    public void testeRabbit() {
        Task task = new Task();
        taskProducer.sendMessage(task);
    }
}
