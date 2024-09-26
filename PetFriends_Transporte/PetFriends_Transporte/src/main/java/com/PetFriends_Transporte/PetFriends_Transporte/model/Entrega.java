package com.PetFriends_Transporte.PetFriends_Transporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long pedidoId;
    private String dataEnvio;
    private String dataEstimadaEntrega;
    private String status; // ex: em trânsito, entregue, devolvido
    private String transportadora;
}
