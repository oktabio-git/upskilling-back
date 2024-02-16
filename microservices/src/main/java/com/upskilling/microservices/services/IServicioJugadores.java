package com.upskilling.microservices.services;

import com.upskilling.microservices.model.Jugador;

import java.util.List;

public interface IServicioJugadores {
    public List<Jugador> recuperarJugadoresPorEquipo(String nombreEquipo);
}
