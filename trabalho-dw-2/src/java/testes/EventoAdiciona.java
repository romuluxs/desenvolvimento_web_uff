/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import dao.EventoDao;
import model.Evento;
import tipos.TipoEvento;

/**
 *
 * @author Romulo
 */


public class EventoAdiciona {

    public static void main(String[] args) {
        Evento evento = new Evento();
        evento.setNome("Angra");
        evento.setTipo(TipoEvento.Show);
        evento.setHora("17:45");
        evento.setData("18/07/2016");
        evento.setLocal("Circo Voador");
        
        EventoDao dao = new EventoDao();
        dao.adiciona(evento);
    }
}
