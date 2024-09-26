package com.PetFriends_Almoxarifado.PetFriends_Almoxarifado.service;

import org.springframework.stereotype.Service;

import com.PetFriends_Almoxarifado.PetFriends_Almoxarifado.domain.PedidoStatus;
import com.PetFriends_Almoxarifado.PetFriends_Almoxarifado.eventos.EstadoPedidoMudou;

@Service
public class AlmoxarifadoService {

    public void processarEvento(EstadoPedidoMudou evento) {
      
        if (evento.getEstado() == PedidoStatus.FECHADO) {
        
        } else if (evento.getEstado() == PedidoStatus.CANCELADO) {
           
        }
     
    }
}

