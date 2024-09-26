package com.PetFriends_Almoxarifado.PetFriends_Almoxarifado.model;

import lombok.Data;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Data
@Entity
public class ProdutoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long produtoId;
    private int quantidade;

    @Embedded
    private Localizacao localizacao;
    
    private String status;
}


