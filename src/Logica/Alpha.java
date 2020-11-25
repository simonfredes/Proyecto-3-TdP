package Logica;

import Grafico.GraficoAlpha;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor_alpha;

public class Alpha extends Infectado {

	public Alpha(Juego j) {
		super(j);
		this.visitor = new Visitor_alpha(this);
		this.grafico = new GraficoAlpha();
		this.velocidad = 5;
		this.letalidad = 25;
	}

	@Override
	public void recibir_danio(float d) {
		this.carga_viral -= d;
		if (carga_viral <= 0) {
			// lo eliminamos
		} else {
			if (carga_viral < 20) {
				this.movimiento = new Movimiento_vertical_rapido(this);
			}
		}
	}

}
