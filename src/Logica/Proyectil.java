package Logica;

import Grafico.GraficoProyectilSanitario;
import Movimiento.Movimiento_vertical_rapido;
import Visitor.Visitor_proyectil;

public abstract class Proyectil extends Entidad{
	
	protected int cap_desinfeccion;
	
	public Proyectil(Juego j) {
		super(j);
		this.movimiento = new Movimiento_vertical_rapido(this);
		this.imagen = new GraficoProyectilSanitario();
		this.visitor = new Visitor_proyectil();
	}
}