package Logica;

import Grafico.GraficoProyectilSanitarioPremio;

public class Proyectil_sanitario_premio extends Proyectil{
	
	//relentiza tambien
	public Proyectil_sanitario_premio(Juego j) {
		super(j);
		this.grafico = new GraficoProyectilSanitarioPremio();
		this.velocidad = 10;
		this.cap_desinfeccion= 40;	
		
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}