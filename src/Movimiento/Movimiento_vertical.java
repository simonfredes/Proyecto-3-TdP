package Movimiento;

import java.awt.Point;

import Logica.Entidad;

public class Movimiento_vertical extends Movimiento {

	public Movimiento_vertical(Entidad e) {
		super(e);
	}

	public void mover() {
		Point p = entidad.getGrafico().getLocation();
		double x = p.getX();
		double y = p.getY() + entidad.getVelocidad() * direccion;
		this.mover_aux(p, x, y);
		
//		if (y < entidad.getJuego().getPlayer().getGrafico().getY()) {
//			p.setLocation(x, y);
//			entidad.getGrafico().setLocation(p);
//		}else {//subirlo
//			setear_ubicacion_inicial(p);
//		}
	}
}