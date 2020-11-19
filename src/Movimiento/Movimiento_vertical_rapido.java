package Movimiento;

import java.awt.Point;

import Grafico.Grafico;
import Logica.Entidad;

public class Movimiento_vertical_rapido extends Movimiento_vertical {
	protected int velocidad_extra;

	public Movimiento_vertical_rapido(Entidad entidad, Grafico grafico) {
		super(entidad, grafico);
		this.velocidad_extra = 6;
	}

	public void mover() {
		Point p = grafico.getLocation();
		double x = p.getX();
		double y = p.getY() + entidad.get_velocidad_movimiento() * direccion + velocidad_extra;
		p.setLocation(x, y);
		grafico.setLocation(p);
	}

}