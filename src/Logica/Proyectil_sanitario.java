package Logica;

import Grafico.GraficoProyectilSanitario;

public class Proyectil_sanitario extends Proyectil{
	
	public Proyectil_sanitario(Juego juego) {
		super(juego);
		this.grafico = new GraficoProyectilSanitario();
		this.velocidad = 8;
		this.cap_desinfeccion = 25;
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}