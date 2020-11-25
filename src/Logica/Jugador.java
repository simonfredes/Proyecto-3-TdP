package Logica;

import java.awt.Point;

import GUI.gameGUI;
import Grafico.GraficoJugador;
import Premio.Premio;

public class Jugador extends Personaje {

	protected Arma arma; // conceptual
	protected int limite_izq, limite_der;

	public Jugador(Juego j) {
		super(j);
		this.imagen = new GraficoJugador();
		limite_der = gameGUI.LIMITE_DER_X - this.imagen.getAncho();
		limite_izq = gameGUI.LIMITE_IZQ_X;
		carga_viral = 0;
		arma = new Arma(new Proyectil_sanitario(j));
		posicion = new Point(limite_der / 2, gameGUI.LIMITE_INFERIOR - imagen.getAlto() - 10);
		premio = null;
	}

	@Override
	public boolean esta_infectado() {
		boolean esta_inf = false;
		if (carga_viral >= 100) {
			esta_inf = true;
		}
		return esta_inf;
	}

	public void setPremio(Premio m) {
		this.premio = m;
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral += d;

	}

	public void disparar() {
		arma.disparar();
	}

	public void moverADerecha() {
		if (posicion.getX() < limite_der) {
			posicion.setLocation(posicion.getX() + 6, posicion.getY());
		}
	}

	public void moverAIzquierda() {
		if (posicion.getX() > limite_izq) {
			posicion.setLocation(posicion.getX() - 6, posicion.getY());
		}
	}

	@Override
	public void accionar() {
		// ACTUALIZAR DISPARO
	}

}