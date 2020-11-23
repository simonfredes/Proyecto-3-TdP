package Logica;

public class Arma {
	
	protected Proyectil p;

	public Arma(Proyectil p) {
		this.p = p;
	}

	public void disparar() {
		// crear un nuevo proyectil y ubicarlo en el mapa
		//p = new Proyectil_sanitario();
		//ubicarlo
	}

	public void setProyectil(Proyectil p) {
		this.p = p;
	}
}