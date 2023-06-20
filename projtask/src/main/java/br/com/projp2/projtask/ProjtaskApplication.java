package br.com.projp2.projtask;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProjtaskApplication {

    @Value("${rabbitmq.queue.task.name}")
    private String nomeQueue;

    public static void main(String[] args) {
        SpringApplication.run(ProjtaskApplication.class, args);
    }

    @Bean
    public Queue minhaQueue() {
        return new Queue(nomeQueue, true);
    }

}
