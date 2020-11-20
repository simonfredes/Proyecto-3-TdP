package Logica;

import Movimiento.Movimiento_vertical;

public class Beta extends Infectado{
	
	public Beta() {
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
