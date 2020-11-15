package Logica;

public abstract class Infectado extends Personaje{
	
	protected int letalidad;
	
	public boolean esta_infectado() {
		boolean es = false;
		if (carga_viral > 0) {
			es = true;
		}
		return es;
	}
	
}
