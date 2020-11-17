package Logica;

import Grafico.Grafico;
import Visitor.Visitor;

public abstract class Entidad {

	protected int velocidad;
	protected Grafico imagen;

	public void setImagen(Grafico i) {
		imagen = i;
	}

	public void aceptar(Visitor v) {

	}

	public Grafico getGrafico() {
		return imagen;
	}

}
