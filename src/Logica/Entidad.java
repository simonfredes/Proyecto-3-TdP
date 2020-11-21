package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Entidad {
	protected Visitor visitor;
	protected int velocidad;
	protected Grafico imagen;
	protected Movimiento movimiento; 
	protected Comportamiento comportamiento;
	protected Juego juego;
	
	
	public Entidad(Visitor v, int velocidad, Grafico img, Movimiento mov, Comportamiento comp, Juego j) {
		this.visitor = v;
		this.velocidad = velocidad;
		this.imagen = img;
		this.movimiento = mov;
		this.comportamiento = comp;
		this.juego = j;
	}
	
	public void setImagen(Grafico i) {
		imagen = i;
	}

	public void aceptar(Visitor v) {
		
	}
	
	public abstract void accionar();
	
	/**
	 * Permite obtener la velocidad de movimiento de una Entidad.
	 * @return la velocidad de una entidad.
	 */
	public int get_velocidad_movimiento() {
		return velocidad;
	}
	
	public Grafico getGrafico() {
		return imagen;
	}
	
	public Juego getJuego() {
		return juego;
	}
	
}