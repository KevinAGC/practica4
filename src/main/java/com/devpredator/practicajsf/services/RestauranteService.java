package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.entity.Gerente;

public class RestauranteService {
	public List<Restaurante> consultarRestaurantes() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();

		Restaurante r1 = new Restaurante();
		Restaurante r2 = new Restaurante();
		Restaurante r3 = new Restaurante();
		Restaurante r4 = new Restaurante();
		Restaurante r5 = new Restaurante();

		Gerente g1 = new Gerente();
		Gerente g2 = new Gerente();
		Gerente g3 = new Gerente();
		Gerente g4 = new Gerente();
		Gerente g5 = new Gerente();

		g1.setNombre("Diego");
		g1.setPrimerApellido("Paniagua");
		g1.setSegundoApellido("López");

		r1.setNombre("McDonalds");
		r1.setDireccion("Dirección 1");
		r1.setPais("Estados Unidos");
		r1.setGerente(g1);

		g2.setNombre("Erick");
		g2.setPrimerApellido("Guerrero");
		g2.setSegundoApellido("Gómez");

		r2.setNombre("La Vid Argentina");
		r2.setDireccion("Direccion 2");
		r2.setPais("Argentina");
		r2.setGerente(g2);

		g3.setNombre("Luis Jesús");
		g3.setPrimerApellido("López");
		g3.setSegundoApellido("Romero");
		r3.setNombre("La Chilaca");
		r3.setDireccion("Direccion 3");
		r3.setPais("Chile");
		r3.setGerente(g3);

		g4.setNombre("Gerardo");
		g4.setPrimerApellido("Guerrero");
		g4.setSegundoApellido("Gómez");
		r4.setNombre("Cienaga");
		r4.setDireccion("Direccion 4");
		r4.setPais("Colombia");
		r4.setGerente(g4);
		
		g5.setNombre("Daniel");
		g5.setPrimerApellido("Guerrero");
		g5.setSegundoApellido("Gómez");
		r5.setNombre("Socarrat");
		r5.setDireccion("Direccion 5");
		r5.setPais("España");
		r5.setGerente(g5);

		restaurantes.add(r1);
		restaurantes.add(r2);
		restaurantes.add(r3);
		restaurantes.add(r4);
		restaurantes.add(r5);

		return restaurantes;
	}
}
