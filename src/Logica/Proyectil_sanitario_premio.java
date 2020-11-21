package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor;

public class Proyectil_sanitario_premio extends Proyectil{
	
	//relentiza tambien
	public Proyectil_sanitario_premio(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		this.cap_desinfeccion= 40;	
		this.movimiento = new Movimiento_vertical_rapido(this);
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}