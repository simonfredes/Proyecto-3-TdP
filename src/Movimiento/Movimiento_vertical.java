package Movimiento;

import java.awt.Point;

import Grafico.Grafico;
import Logica.Entidad;

public class Movimiento_vertical extends Movimiento {

	public Movimiento_vertical(Entidad entidad, Grafico grafico) {
		this.direccion = 1;
		this.entidad = entidad;
		this.grafico = grafico;
	}

	public void mover() {
		Point p = grafico.getLocation();
		double x = p.getX();
		double y = p.getY() + entidad.get_velocidad_movimiento() * direccion;
		p.setLocation(x, y);
		grafico.setLocation(p);
	}
}