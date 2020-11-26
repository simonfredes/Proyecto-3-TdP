package Movimiento;

import java.awt.Point;

import Logica.Entidad;

public class Movimiento_vertical extends Movimiento {

	public Movimiento_vertical(Entidad e, int direccion) {
		super(e,direccion);
		this.duracion = 50;
	}

	public void mover() {
		if (duracion != 0) {
			duracion--;
		}else {
			Point p = entidad.getGrafico().getLocation();
			double x = p.getX();
			double y = p.getY() + entidad.getVelocidad() * direccion;
			this.mover_aux(p, x, y);
			duracion = 50;
		}
	}
}