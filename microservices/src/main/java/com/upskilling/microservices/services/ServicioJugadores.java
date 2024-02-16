package com.upskilling.microservices.services;

import com.upskilling.microservices.model.Jugador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioJugadores implements IServicioJugadores {
    public List<Jugador> recuperarJugadoresPorEquipo(String nombreEquipo) {
        List<Jugador> jugadores = null;
        if(nombreEquipo.equalsIgnoreCase("Argentina")) {
            jugadores = List.of(
                    new Jugador("Luis"),
                    new Jugador("Messi")
            );

        } else if (nombreEquipo.equalsIgnoreCase("España")) {
            jugadores = List.of(
                    new Jugador("Pedro"),
                    new Jugador("Guiñac")
            );
        }

        return jugadores;
    };

}
