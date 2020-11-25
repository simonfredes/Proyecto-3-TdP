package Logica;

import java.awt.Point;

import Comportamiento.Comportamiento;
import Grafico.Grafico;
import Movimiento.Movimiento;
import Visitor.Visitor;

public abstract class Entidad {
	protected Visitor visitor;
	protected Grafico grafico;
	protected Movimiento movimiento;
	protected Comportamiento comportamiento;
	protected Juego juego;
//	protected Point posicion;
	protected int velocidad;

	public Entidad(Juego j) {
		this.juego = j;
	}

	public void setImagen(Grafico i) {
		grafico = i;
	}

	public void aceptar(Visitor v) {

	}

	public Grafico getGrafico() {
		return grafico;
	}

	public int get_x() {
		return this.grafico.getX();
	}

	public int get_y() {
		return this.grafico.getY();
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

	public Point getPosicion() {
		return this.grafico.getLocation();
	}

	public abstract void accionar();

	/**
	 * Permite obtener la velocidad de movimiento de una Entidad.
	 * 
	 * @return la velocidad de una entidad.
	 */
	public Juego getJuego() {
		return juego;
	}

}