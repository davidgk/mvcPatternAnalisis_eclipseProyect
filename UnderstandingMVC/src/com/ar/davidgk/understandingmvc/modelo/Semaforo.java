package com.ar.davidgk.understandingmvc.modelo;

import com.ar.davidgk.understandingmvc.controller.ControllerTrafic;

public class Semaforo {

	private ControllerTrafic controller;

	private SEMAFORO_ESTADOS estado;
	
	//estados validos validos para el ejemplo
	public enum SEMAFORO_ESTADOS{
		ROJO,AMARILLO,VERDE
	}
	
	// Constructor
	public Semaforo(ControllerTrafic controller) {
		this.controller = controller;
	}

	

	public SEMAFORO_ESTADOS getEstado() {
		return estado;
	}

	public void setEstado(SEMAFORO_ESTADOS newEstado) {
		this.estado = newEstado;
		controller.actualizarMisObservadores(this);
	}

	
}
