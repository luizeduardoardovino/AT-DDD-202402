package com.PetFriends_Transporte.PetFriends_Transporte.service;

import org.springframework.stereotype.Service;

import com.PetFriends_Transporte.PetFriends_Transporte.domain.PedidoStatus;
import com.PetFriends_Transporte.PetFriends_Transporte.eventos.EstadoPedidoMudou;

@Service
public class TransporteService {

    public void processarEvento(EstadoPedidoMudou evento) {
        
        if (evento.getEstado() == PedidoStatus.EM_PREPARACAO) {
           
        } else if (evento.getEstado() == PedidoStatus.EM_TRANSITO) {
            
        }
     
    }
}
