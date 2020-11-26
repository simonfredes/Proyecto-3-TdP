package Logica;

import java.awt.Point;

import Grafico.Grafico;
import Grafico.GraficoProyectilSanitario;

public class Proyectil_sanitario extends Proyectil {

	public Proyectil_sanitario(Grafico grafico_jugador) {
		super(grafico_jugador);
		this.grafico = new GraficoProyectilSanitario();
		this.velocidad = 8;
		this.cap_desinfeccion = 25;
		this.grafico.setLocation(grafico_jugador.getX() + this.grafico.getAncho() / 2, grafico_jugador.getY());
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}

}