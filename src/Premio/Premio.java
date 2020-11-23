package Premio;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Logica.Entidad;
import Logica.Juego;
import Movimiento.Movimiento;
import Visitor.Visitor;
import Visitor.Visitor_premio;

public abstract class Premio extends Entidad {
	
	public Premio(Juego j) {
		super(j);
	}

	
	public abstract Premio getPremio();
	
}