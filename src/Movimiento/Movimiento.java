package Movimiento;

import java.awt.Point;
import java.util.Random;

import Logica.Entidad;

public abstract class Movimiento {
	protected int direccion;
	protected Entidad entidad;
	protected int velocidad_extra;
	protected int duracion;

	public abstract void mover() ;
	
	protected void mover_aux(Point p,double x,double y) {
		if (y < entidad.getJuego().getPlayer().getGrafico().getY()) {
			p.setLocation(x, y);
			entidad.getGrafico().setLocation(p);
		}else {
			setear_ubicacion_inicial(p);
		}
	}
	
	protected void setear_ubicacion_inicial(Point p) {
		double y = 0;
		p.setLocation(get_x_random(), y);
		entidad.getGrafico().setLocation(p);
	}

	protected double get_x_random() {
		Random r = new Random();
		double valor = r.nextInt(entidad.getJuego().getGui().getWidth());
		return valor;
	}
}