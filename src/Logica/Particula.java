package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public class Particula extends Entidad{
	
	protected int rango;
	
	public Particula(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}