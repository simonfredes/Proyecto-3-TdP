package Logica;

import Grafico.GraficoJugador;
import Premio.Premio;

public class Jugador extends Personaje {

	protected Arma arma;
	protected int coordenadaX;
	protected int coordenadaY;
	protected Estado estado;

	public Jugador() {
		this.imagen = new GraficoJugador();
		carga_viral = 0;
		coordenadaX = 200;
	}

	@Override
	public boolean esta_infectado() {
		boolean esta_inf = false;
		if (carga_viral >= 100) {
			esta_inf = true;
		}
		return esta_inf;
	}

	public int getX() {
		return coordenadaX;
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral += d;

	}

	public void disparar() {
		arma.disparar();
	}

	public void moverADerecha() {
		if (coordenadaX < 400) {
			coordenadaX += 4;
		}
	}

	public void moverAIzquierda() {
		if (coordenadaX > 3) {
			coordenadaX -= 4;
		}
	}

}