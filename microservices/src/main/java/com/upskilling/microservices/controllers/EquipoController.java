package com.upskilling.microservices.controllers;

import com.upskilling.microservices.model.Equipo;
import com.upskilling.microservices.model.Jugador;
import com.upskilling.microservices.services.IServicioJugadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    private IServicioJugadores servicioJugadores;

    ArrayList<Equipo> equipos = new ArrayList<Equipo>(
            List.of(
                    new Equipo("Argentina", "CONMEBOL"),
                    new Equipo("España", "UEFA"),
                    new Equipo("Marruecos", "CAF"),
                    new Equipo("Uruguay", "CONMEBOL"),
                    new Equipo("Croacia", "UEFA")
            )
    );

    @GetMapping
    public List<Equipo> listarTodos() {
        return equipos;
    }

    @GetMapping("/obtener/{nombre}")
    public ResponseEntity<Equipo> recuperarEquipoPorNombre(@PathVariable String nombre) {
        for (int i = 0; equipos.size() > i; i++) {
            if(equipos.get(i).getNombrePais().equalsIgnoreCase(nombre)) {
                return ResponseEntity.ok(equipos.get(i));
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{nombre}")
    public ResponseEntity borrarEquipoPorNombre(@PathVariable String nombre) {
        for (int i = 0; equipos.size() > i; i++) {
            if(equipos.get(i).getNombrePais().equalsIgnoreCase(nombre)) {
                equipos.remove(i);
                return ResponseEntity.ok("Equipo correctamente borrado");
            }
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/agregar")
    public void crearEquipo(@RequestBody Equipo equipo) {
        equipos.add(equipo);
    }

    @PutMapping("/editar")
    public ResponseEntity editarEquipoPorNombre(@RequestBody Equipo equipoModify) {
        for(Equipo equipo : equipos) {
            if(equipo.getNombrePais().equalsIgnoreCase(equipoModify.getNombrePais())) {
                equipo.setConf(equipoModify.getConf());
                equipo.setRanking(equipoModify.getRanking());
                return ResponseEntity.ok("Equipo " + equipoModify.getNombrePais() + " correctamente actualizado");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/goles/{equipo1}/{equipo2}")
    public String recuperaEquipo(@PathVariable String equipo1, @PathVariable String equipo2) {
        int golesA = (int)(Math.random()*10+1);;
        int golesB = (int)(Math.random()*10+1);;
        String frase =  "El equipo " + equipo1 + " anotó " + golesA + " goles y el equipo " + equipo2 + " anotó " + golesB + " goles.";
        return frase;
    }

    @GetMapping("/{nombreEquipo}/jugadores")
    public ResponseEntity<?> listarJugadoresPorEquipo(@PathVariable String nombreEquipo) {
//        ArrayList<Jugador> jugadores = new ArrayList<Jugador>(
//                List.of(
//                        new Jugador("Luis"),
//                        new Jugador("Messi")
//                )
//        );
//      ServicioJugadores servicioJugadores = new ServicioJugadores();
        List<Jugador> jugadores = servicioJugadores.recuperarJugadoresPorEquipo(nombreEquipo); // Recuperar desde un servicio.
        return ResponseEntity.ok(jugadores);
    }
}
