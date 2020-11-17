package Logica;

import java.awt.Point;

import Premio.Premio;

public abstract class Infectado extends Personaje{
	
	protected int letalidad;
	protected Point posicionActual;
	protected Premio premio;
	
	
	public boolean esta_infectado() {
		boolean es = false;
		if (carga_viral > 0) {
			es = true;
		}
		return es;
	}
	//si al recibir daño, se desinfecta y además tiene premio, dropeamos premio en la pos posactual
}
