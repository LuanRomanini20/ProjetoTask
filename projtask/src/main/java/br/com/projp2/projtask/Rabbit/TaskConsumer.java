package br.com.projp2.projtask.Rabbit;


import br.com.projp2.projtask.Model.Task;
import br.com.projp2.projtask.Service.TaskService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TaskConsumer {

    @Autowired
    private TaskService taskService;

    @RabbitListener(queues = {"${rabbitmq.queue.task.name}"})
    public void receive (@Payload Task task){
       // System.out.println("Id: "+ task.getId() + "\nNome: " + task.getNome());
        //Inserir dado no Mongo
        taskService.criarTarefa(task);
    }
}