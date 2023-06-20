package br.com.projp2.projtask.Rabbit;

import br.com.projp2.projtask.Model.Task;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TaskProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void sendMessage(@Payload Task task) {
        rabbitTemplate.convertAndSend(queue.getName(), task);
    }

}

