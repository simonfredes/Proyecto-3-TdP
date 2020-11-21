package Premio;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Logica.Entidad;
import Logica.Juego;
import Movimiento.Movimiento;
import Visitor.Visitor;
import Visitor.Visitor_premio;

public abstract class Premio extends Entidad {
	
	public Premio(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		super(v, velocidad, img, mov, comp, j);
	}
	
	public Premio() {
		this(new Visitor_premio(), 20,null, null, null, null);
	}
	
	public abstract Premio getPremio();
	
}