package Logica;

import Movimiento.Movimiento_vertical_rapido;

public abstract class Proyectil extends Entidad{
	
	protected int cap_desinfeccion;
	
	public Proyectil(Juego j) {
		super(j);
		this.movimiento = new Movimiento_vertical_rapido(this);
	}

	
}