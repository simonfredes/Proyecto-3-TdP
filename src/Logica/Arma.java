package Logica;

public class Arma {
	
	protected Proyectil proyectil;
	protected Jugador jugador;
	
	public Arma(Proyectil p) {
		this.proyectil = p;
	}

	public Proyectil disparar() {
		// crear un nuevo proyectil y ubicarlo en el mapa
		proyectil = new Proyectil_sanitario(jugador.getGrafico());
		//ubicarlo
		return proyectil;
	}

	public void setProyectil(Proyectil p) {
		this.proyectil = p;
	}
}