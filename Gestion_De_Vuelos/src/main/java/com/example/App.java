package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// 1. Crear una lista para guardar los vuelos
		List<Vuelo> listaVuelos = new ArrayList<>();

		// 2. Vuelo a JAPÓN (3 destinos como mínimo)
		Vuelo v1 = Vuelo.builder().destino(Destino.JAPON).precio(new BigDecimal("1150.50")).fechaSalida(LocalDate.now())
				.horaSalida(LocalTime.of(10, 10)).fechaLlegada(LocalDate.now())
				.horaLlegada(LocalTime.of(14, 30)).numeroPlazas(3).build();

		v1.meterPasajero(new Pasajero("Antonio", "García", "Pérez", LocalDate.of(1980, 5, 12), Genero.HOMBRE));
		v1.meterPasajero(new Pasajero("Carmen", "Sánchez", "Gómez", LocalDate.of(1985, 11, 24), Genero.MUJER));

		// 3. Vuelo a ESPAÑA
		Vuelo v2 = Vuelo.builder().destino(Destino.ESPAÑA).precio(new BigDecimal("120.00")).fechaSalida(LocalDate.now())
				.horaSalida(LocalTime.of(18, 45)).fechaLlegada(LocalDate.now()).horaLlegada(LocalTime.of(20, 15))
				.numeroPlazas(2).build();

		v2.meterPasajero(new Pasajero("Manuel", "López", "Martínez", LocalDate.of(1975, 2, 8), Genero.HOMBRE));

		// 4. Vuelo a PORTUGAL (Este tendrá más pasajeros para el ejercicio preliminar)
		Vuelo v3 = Vuelo.builder().destino(Destino.PORTUGAL).precio(new BigDecimal("95.00"))
				.fechaSalida(LocalDate.now()).horaSalida(LocalTime.of(9, 0))
				.fechaLlegada(LocalDate.now()).horaLlegada(LocalTime.of(10, 30)).numeroPlazas(3).build();

		v3.meterPasajero(new Pasajero("Lucía", "Fernández", "Díaz", LocalDate.of(1992, 7, 14), Genero.MUJER));
		v3.meterPasajero(new Pasajero("Javier", "Ruiz", "Hernández", LocalDate.of(1988, 3, 30), Genero.HOMBRE));
		v3.meterPasajero(new Pasajero("Elena", "Álvarez", "Moreno", LocalDate.of(1995, 12, 5), Genero.MUJER));

		// los vuelos de la colección
		listaVuelos.add(v1);
		listaVuelos.add(v2);
		listaVuelos.add(v3);
	}
}
