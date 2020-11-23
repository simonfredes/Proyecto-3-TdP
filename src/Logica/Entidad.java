package Logica;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Entidad {
	protected Visitor visitor;
	protected Grafico imagen;
	protected Movimiento movimiento; 
	protected Comportamiento comportamiento;
	protected Juego juego;
	
	protected int velocidad;
	
	public Entidad(Juego j) {
		this.juego = j;
	}
	
	public void setImagen(Grafico i) {
		imagen = i;
	}

	public void aceptar(Visitor v) {
		
	}
	
	public Grafico getGrafico() {
		return imagen;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	public void setComportamiento(Comportamiento comportamiento) {
		this.comportamiento = comportamiento;
	}
	public Movimiento getMovimiento() {
		return movimiento;
	}
	
	public abstract void accionar();
	
	/**
	 * Permite obtener la velocidad de movimiento de una Entidad.
	 * @return la velocidad de una entidad.
	 */	
	public Juego getJuego() {
		return juego;
	}
	
}