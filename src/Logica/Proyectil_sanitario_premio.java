package Logica;

import Grafico.GraficoProyectilSanitarioPremio;

public class Proyectil_sanitario_premio extends Proyectil{
	
	//relentiza tambien
	public Proyectil_sanitario_premio(Juego j) {
		super(j);
		this.cap_desinfeccion= 40;	
		this.imagen = new GraficoProyectilSanitarioPremio();
	}

	@Override
	public void accionar() {
		movimiento.mover();
	}
	
}