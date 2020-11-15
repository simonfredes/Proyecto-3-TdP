package Logica;

public class Alpha extends Infectado {

	public Alpha() {
		carga_viral = 100;
		letalidad = 25;
	}

	@Override
	public void recibir_danio(float d) {
		
		carga_viral -= d;
	
		if (carga_viral <= 0) {
			// lo eliminamos
		}else {
			if (carga_viral < 20) {
				velocidad_mov *= 2;
			}
		}
	}

}
