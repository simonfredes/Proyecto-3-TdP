package Logica;

import Premio.Premio;

public abstract class Personaje extends Entidad{
	protected float carga_viral;
	protected Premio premio;
	
	public Personaje(Juego j) {
		super(j);
	}
	
	public Premio getPremio() {
		return premio;
	}

	public abstract boolean esta_infectado();
	public abstract void recibir_danio(float d);

}