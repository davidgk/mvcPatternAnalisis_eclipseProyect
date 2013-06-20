package com.ar.davidgk.understandingmvc.controller;

import java.util.ArrayList;

import com.ar.davidgk.understandingmvc.modelo.Semaforo;
import com.ar.davidgk.understandingmvc.vista.AbstractVehiculo;

public class ControllerTrafic {

	private ArrayList<AbstractVehiculo> listaObservadores;

	// Contrstrucor con inicializador de lista que contendra los observadores
	private ControllerTrafic(){
		this.listaObservadores = new ArrayList<AbstractVehiculo>();
	}

	// getInstance() singleton
	public static ControllerTrafic getInstance() {
		return ControllerSingleton.instance;
	}
	
	// Singleton thread safe creator
	private static class ControllerSingleton{
		private static ControllerTrafic instance = new ControllerTrafic();
	}
	
	//getter
	public ArrayList<AbstractVehiculo> getListaObservadores() {
		return listaObservadores;
	}

	public void actualizarMisObservadores(Semaforo semaforo) {
		for (AbstractVehiculo vehiculo : listaObservadores) {
			vehiculo.updateMiComportamiento(semaforo.getEstado());
		}
	}
	
}
