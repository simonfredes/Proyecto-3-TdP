package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Personaje extends Entidad{
	protected float carga_viral;
	
	public Personaje(Juego j) {
		super(j);
	}

	public abstract boolean esta_infectado();
	public abstract void recibir_danio(float d);

}