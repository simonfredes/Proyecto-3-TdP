package Logica;

import Grafico.GraficoJugador;
import Premio.Premio;

public class Jugador extends Personaje {

	protected Arma arma; //conceptual
	protected int coordenadaX;
	protected int coordenadaY;
	protected Premio premio;

	public Jugador(Juego j) {
		super(j);
		this.imagen = new GraficoJugador();
		carga_viral = 0;
		arma = new Arma(new Proyectil_sanitario(j));
		coordenadaX = 300; // obtener coordenada generica
		//coordenadaY = 0; obtener coordenada generica
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
		if (coordenadaX < 600) {
			coordenadaX += 6;
		}
		
//		if (coordenadaX < juego.getGui().get_ancho()) {
//			coordenadaX += 6;
//		}
//		
		
	}

	public void moverAIzquierda() {
		if (coordenadaX > 3) {
			coordenadaX -= 6;
		}
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}