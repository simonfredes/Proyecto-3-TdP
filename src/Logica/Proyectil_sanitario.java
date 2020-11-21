package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor;
import Visitor.Visitor_proyectil;

public class Proyectil_sanitario extends Proyectil{
	
	
	public Proyectil_sanitario(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		this.cap_desinfeccion= 30;
		this.movimiento = new Movimiento_vertical_rapido(this);
	}
	
	public Proyectil_sanitario() {
		this(new Visitor_proyectil(), 20, null, null, null, null);
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}