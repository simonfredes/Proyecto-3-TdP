package Premio;

import Grafico.Grafico;
import Logica.Entidad;
import Logica.Infectado;
import Logica.Juego;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor_premio;

public abstract class Premio extends Entidad {

	protected Infectado infectado;

	public Premio(Juego j, Grafico grafico) {
		super(j);
		this.visitor = new Visitor_premio();
//		this.grafico.setLocation(grafico.getLocation()); 
		this.movimiento = new Movimiento_vertical_rapido(this);
	}

	public abstract Premio getPremio();

}