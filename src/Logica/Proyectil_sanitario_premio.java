package Logica;

import Movimiento.Movimiento_vertical_rapido;

public class Proyectil_sanitario_premio extends Proyectil{
	
	//relentiza tambien
	public Proyectil_sanitario_premio() {
		this.cap_desinfeccion= 40;	
		this.movimiento = new Movimiento_vertical_rapido(this);
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}