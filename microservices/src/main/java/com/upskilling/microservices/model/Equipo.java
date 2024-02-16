package com.upskilling.microservices.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Equipo {
    @NonNull
    private String nombrePais;
    @NonNull
    private String conf;
    private int ranking;

}
