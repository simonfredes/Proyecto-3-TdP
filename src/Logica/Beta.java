package Logica;

public class Beta extends Infectado{
	
	public Beta() {
		carga_viral = 100;
		letalidad = 10;
	}

	@Override
	public void recibir_danio(float d) {
		carga_viral -= d * 0.15;
		
		if (carga_viral <= 0) {
			// lo morimos
		}
	}
	
	
}
