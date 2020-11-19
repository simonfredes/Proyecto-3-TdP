package Movimiento;

import Grafico.Grafico;
import Logica.Entidad;

public abstract class Movimiento {
	protected int direccion;
	protected Grafico grafico;
	protected Entidad entidad;
	
	public abstract void mover();
}