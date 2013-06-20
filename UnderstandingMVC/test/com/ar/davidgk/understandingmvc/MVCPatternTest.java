package com.ar.davidgk.understandingmvc;

import org.junit.Test;

import com.ar.davidgk.understandingmvc.controller.ControllerTrafic;
import com.ar.davidgk.understandingmvc.modelo.Semaforo;
import com.ar.davidgk.understandingmvc.modelo.Semaforo.SEMAFORO_ESTADOS;
import com.ar.davidgk.understandingmvc.vista.AbstractVehiculo;
import com.ar.davidgk.understandingmvc.vista.Auto;
import com.ar.davidgk.understandingmvc.vista.Camion;
import com.ar.davidgk.understandingmvc.vista.Moto;


public class MVCPatternTest {

	@Test
	public void mvcPatternTest(){
		/**Creamos el controlador 
		 que regulara el flujo y permitira que:
		 1.- La vista se actualize a los cambios del modelo
		 2.- el modelo repercuta los cambios qe le sucedan en la vista
		 3.- El modelo no queda acoplado a la vista
		 */
		ControllerTrafic controller =ControllerTrafic.getInstance();
		
		/**Creamos los Observadores , Que son las vistas*/
		AbstractVehiculo auto = new Auto("marcaAuto");
		AbstractVehiculo camion = new Camion("marcaCamion");
		AbstractVehiculo moto = new Moto("marcaMoto");
	
		/** El controller adquiere registro de las vista que debera actualizar*/
		controller.getListaObservadores().add(auto);
		controller.getListaObservadores().add(camion);
		controller.getListaObservadores().add(moto);
		
		/**Creamos el Observable , es decir el Modelo del Patron,
		al cambiar este , repercutira los cambios en la vista por medio del aviso 
		A traves del controlador
		*/
		Semaforo sem = new Semaforo(controller);
		
		/**
		 * Cambiamos Varias veces el estado del semaforo
		 * y veremos como repercute esto en las vistas
		 */
		System.out.println("***********************");
		System.out.println("Semaforo en ROJO");
		sem.setEstado(SEMAFORO_ESTADOS.ROJO);
		System.out.println("***********************");
		System.out.println("Semaforo en AMARILLO");
		sem.setEstado(SEMAFORO_ESTADOS.AMARILLO);	
		System.out.println("***********************");
		System.out.println("Semaforo en VERDE");
		sem.setEstado(SEMAFORO_ESTADOS.VERDE);
		System.out.println("***********************");		
	}
	
}
