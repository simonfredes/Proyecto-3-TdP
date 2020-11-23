package Logica;

import Grafico.GraficoProyectilSanitario;

public class Proyectil_sanitario extends Proyectil{
	
	
	public Proyectil_sanitario(Juego j) {
		super(j);
		this.cap_desinfeccion = 25;
		this.imagen = new GraficoProyectilSanitario();
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}