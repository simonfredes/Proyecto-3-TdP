package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Movimiento.Movimiento_vertical;
import Visitor.Visitor;

public class Beta extends Infectado{
	
	public Beta(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		carga_viral = 100;
		letalidad = 10;
		movimiento = new Movimiento_vertical(this);
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral -= d * 0.15;
		
		if (carga_viral <= 0) {
			// lo morimos
		}
	}
	
	@Override
	public void accionar() {
		//lanzar particula
		//moverse
		this.mover();
	}
	
}
