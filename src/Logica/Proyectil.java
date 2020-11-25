package Logica;

import Movimiento.Movimiento_vertical;
import Visitor.Visitor_proyectil;

public abstract class Proyectil extends Entidad{
	
	protected int cap_desinfeccion;
	
	public Proyectil(Juego j) {
		super(j);
		this.visitor = new Visitor_proyectil();
		this.movimiento = new Movimiento_vertical(this);
//		this.grafico.setLocation(this.juego.getPlayer().getPosicion());
	}
}