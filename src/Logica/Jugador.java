package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Grafico.GraficoJugador;
import Movimiento.Movimiento;
import Premio.Premio;
import Visitor.Visitor;

public class Jugador extends Personaje {

	protected Arma arma;
	protected int coordenadaX;
	protected int coordenadaY;
	protected Premio premio;

	public Jugador(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
		this.imagen = new GraficoJugador();
		carga_viral = 0;
		coordenadaX = 300;
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