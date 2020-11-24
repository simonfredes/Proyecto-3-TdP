package Logica;

import Grafico.GraficoBeta;
import Visitor.Visitor_beta;

public class Beta extends Infectado{
	
	public Beta(Juego j) {
		super(j);
		this.letalidad = 10;
		this.visitor = new Visitor_beta(this);
		this.imagen = new GraficoBeta();
		this.particula = null;
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral -= d * 0.15;
		
		if (carga_viral <= 0) {
			this.getJuego().getMap().eliminarEntidad_activos(this);
		}
	}
	
}
