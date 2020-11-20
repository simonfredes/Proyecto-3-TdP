package Logica;

import Movimiento.Movimiento_vertical;
import Movimiento.Movimiento_vertical_rapido;

public class Alpha extends Infectado {

	public Alpha() {
		this.carga_viral = 100;
		this.letalidad = 25;
		this.movimiento = new Movimiento_vertical(this);
	}
	
	@Override
	public void recibir_danio(float d) {
		
		this.carga_viral -= d;
	
		if (carga_viral <= 0) {
			// lo eliminamos
		}else {
			if (carga_viral < 20) {
				this.movimiento = new Movimiento_vertical_rapido(this);
			}
		}
	}

	@Override
	public void accionar() {
		//lanzar particula
		//moverse
		this.mover();
	}

}
