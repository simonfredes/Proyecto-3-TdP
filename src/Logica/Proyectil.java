package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Proyectil extends Entidad{
	public Proyectil(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		// TODO Auto-generated constructor stub
	}

	protected int cap_desinfeccion;
}