package Logica;

import java.awt.Point;

import Grafico.GraficoJugador;
import Premio.Premio;

public class Jugador extends Personaje {

	protected Arma arma; //conceptual
	protected Premio premio;
	protected int limiteX;
	
	public Jugador(Juego j) {
		super(j);
		limiteX = juego.getGui().get_ancho();
		this.imagen = new GraficoJugador();
		carga_viral = 0;
		arma = new Arma(new Proyectil_sanitario(j));
		posicion= new Point(limiteX/2 , 50);
		premio = null;
	}
	
	public Premio getPremio() {
		return premio;
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
		return (int) posicion.getX();
	}

	public void setPremio(Premio m) {
		this.premio=m;
	}
	
	@Override
	public void recibir_danio(float d) {
		carga_viral += d;

	}

	public void disparar() {
		arma.disparar();
	}

	public void moverADerecha() {
		if (posicion.getX() < limiteX) {
			posicion.setLocation(posicion.getX() + 6, posicion.getY());
		}
	
//		if (coordenadaX < juego.getGui().get_ancho()) {
//			coordenadaX += 6;
//		}
//		
		
	}

	public void moverAIzquierda() {
//		if (coordenadaX > 3) {
//			coordenadaX -= 6;
//		}
	}

	@Override
	public void accionar() {
		//ACTUALIZAR DISPARO
	}

}