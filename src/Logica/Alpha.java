package Logica;

import java.util.Random;

import GUI.gameGUI;
import Grafico.GraficoAlpha;
import Movimiento.Movimiento_vertical_rapido;
import Premio.Efecto_temporal;
import Premio.Objeto_precioso;
import Visitor.Visitor_alpha;

public class Alpha extends Infectado {

	public Alpha(Juego j) {
		super(j);
		this.visitor = new Visitor_alpha(this);
		this.grafico = new GraficoAlpha();
		Random ran = new Random();
		int valor;
		valor = ran.nextInt(3);
		if (valor == 0) {
			premio = new Efecto_temporal(this.grafico);
		} else {
			if (valor == 1) {
				premio = new Objeto_precioso(this.grafico);
			} else {
				premio = null;
			}
		}
		valor = ran.nextInt(gameGUI.LIMITE_DER_X);
		this.grafico.setLocation(valor, gameGUI.LIMITE_SUPERIOR);
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
