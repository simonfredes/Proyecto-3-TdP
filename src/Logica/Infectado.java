package Logica;

import java.awt.Point;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Premio.Premio;
import Visitor.Visitor;

public abstract class Infectado extends Personaje {

	public Infectado(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
	}

	protected int letalidad;
	protected Point posicionActual;
	protected Premio premio;
	protected Particula particula;
	
	// si al recibir daño, se desinfecta y además tiene premio, dropeamos premio en
	// la pos posactual
	public boolean esta_infectado() {
		boolean es = false;
		if (carga_viral > 0) {
			es = true;
		}
		return es;
	}

	public void mover() {
		movimiento.mover();
	}

	public void lanzar_particula() {
		
	}

}
/*


*/