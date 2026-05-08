package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vuelo {
	private Destino destino;
	private BigDecimal precio;
	private LocalDate fechaSalida;
	private LocalTime horaSalida;
	private LocalDate fechaLlegada;
	private LocalTime horaLlegada;
	private int numeroPlazas;
	@Builder.Default
	private List<Pasajero> pasajeros = new ArrayList<>();

	public void meterPasajero(Pasajero p) {
        if (this.pasajeros.size() < this.numeroPlazas) {
            this.pasajeros.add(p);
        } else {
            System.out.println("Error: Vuelo a " + this.destino + " lleno. No se puede añadir a " + p.nombre());
        }
    }
}