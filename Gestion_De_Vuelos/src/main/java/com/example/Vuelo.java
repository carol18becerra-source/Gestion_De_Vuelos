package com.example;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
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

	
}