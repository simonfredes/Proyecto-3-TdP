package Logica;

import Movimiento.Movimiento_vertical_rapido;

public class Proyectil_sanitario extends Proyectil{
	
	
	public Proyectil_sanitario() {
		this.cap_desinfeccion= 30;
		this.movimiento = new Movimiento_vertical_rapido(this);
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}