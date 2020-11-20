package Movimiento;

import java.awt.Point;

import Logica.Entidad;

public class Movimiento_vertical_rapido extends Movimiento_vertical {
	

	public Movimiento_vertical_rapido(Entidad entidad) {
		super(entidad);
		this.velocidad_extra = 6;
		duracion = 20;
	}

	public void mover() {
		Point p = entidad.getGrafico().getLocation();
		double x = p.getX();
		double y = p.getY() + entidad.get_velocidad_movimiento() * direccion + velocidad_extra;
		this.mover_aux(p, x, y);
//		p.setLocation(x, y);
//		entidad.getGrafico().setLocation(p);
	}

}