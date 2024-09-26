package com.PetFriends_Transporte.PetFriends_Transporte.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.PetFriends_Transporte.PetFriends_Transporte.eventos.EstadoPedidoMudou;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class RabbitMQConfig {

    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQConfig.class);

    @Bean
    public Queue pedidosQueue() {
        return new Queue("PetFriends_Pedidos", true);
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(org.springframework.amqp.rabbit.connection.ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }

    @RabbitListener(queues = "PetFriends_Pedidos")
    public void listen(EstadoPedidoMudou message) {
        LOG.info("Received message: " + message);

    }
}

