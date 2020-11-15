package Logica;

public class Jugador extends Personaje{
	
	protected Arma arma;
	
	public Jugador() {
		carga_viral = 0;
	}
     
	@Override
	public boolean esta_infectado() {
		boolean esta_inf = false;
		if (carga_viral >= 100) {
			esta_inf = true;
		}
		return esta_inf;
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral += d;
		
	}
	
	public void disparar() {
		//dispara 
	}

}
