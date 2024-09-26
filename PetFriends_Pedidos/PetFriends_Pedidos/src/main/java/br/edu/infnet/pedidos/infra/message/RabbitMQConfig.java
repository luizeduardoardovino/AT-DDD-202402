package br.edu.infnet.pedidos.infra.message;

import javax.naming.Binding;	

import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;


import br.edu.infnet.pedidos.eventos.EstadoPedidoMudou;
import br.edu.infnet.pedidos.infra.service.PedidoService;
import ch.qos.logback.classic.Logger;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue() {
        return new Queue("PetFriends_Pedidos", false);
    }

    @RabbitListener(queues = "PetFriends_Pedidos")
    public void listen(EstadoPedidoMudou message) {
        System.out.println("Received message: " + message);
    }
}










