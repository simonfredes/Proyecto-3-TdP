package Premio;

import Grafico.Grafico;
import Grafico.GraficoPremio;
import Logica.Juego;

public class Objeto_precioso extends Premio{

	public Objeto_precioso(Juego j,Grafico grafico) {
		super(j,grafico);
		this.grafico = new GraficoPremio();
		this.velocidad = 30;
	}

	@Override
	public Premio getPremio() {
		return null;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
}