package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Movimiento.Movimiento_vertical;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor;
import Visitor.Visitor_alpha;

public class Alpha extends Infectado {

	public Alpha(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		this.carga_viral = 100;
		this.letalidad = 25;
		this.movimiento = new Movimiento_vertical(this);
	}
	
	
//	public Alpha() {
//		
//		this(new Visitor_alpha(new Alpha()), 20, null, null, null, null);
//	}
	
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
