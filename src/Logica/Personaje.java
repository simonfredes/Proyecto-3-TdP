package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Personaje extends Entidad{
	protected float carga_viral;
	
	public Personaje(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
	}

	public abstract boolean esta_infectado();
	public abstract void recibir_danio(float d);

}