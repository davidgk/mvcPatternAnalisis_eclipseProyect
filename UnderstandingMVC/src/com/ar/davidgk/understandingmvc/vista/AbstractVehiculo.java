package com.ar.davidgk.understandingmvc.vista;

import com.ar.davidgk.understandingmvc.modelo.Semaforo.SEMAFORO_ESTADOS;

public abstract class AbstractVehiculo {

	private String marca;

	public AbstractVehiculo(String marca) {
		this.marca = marca;
	}

	public void updateMiComportamiento(SEMAFORO_ESTADOS estado) {
		switch (estado) {
			case ROJO:
				System.out.println("******************");
				System.out.println(this.marca + " : Me Detengo");
				System.out.println("******************");
				break;
			case AMARILLO:
				System.out.println("******************");
				System.out.println(this.marca + " : Miramos con precaucion");
				System.out.println("******************");
				break;
			case VERDE:
				System.out.println("******************");
				System.out.println(this.marca + " : Avanzamos");
				System.out.println("******************");
				break;
		}
	}
}

