package Logica;

import java.awt.Point;
import java.util.Random;

import Movimiento.Movimiento_vertical;
import Premio.Efecto_temporal;
import Premio.Objeto_precioso;
import Premio.Premio;

public abstract class Infectado extends Personaje {
	
	protected int letalidad;
	protected Point posicionActual;
	protected Premio premio;
	protected Particula particula;
	protected int cooldown; //duracion
	
	
	public Infectado(Juego j) {
		super(j);
		this.carga_viral = 100;
		this.movimiento = new Movimiento_vertical(this);
		cooldown = 45;
		int random;
		Random ran = new Random();
		random = ran.nextInt(3);
		if (random == 0) {
			premio = new Efecto_temporal(j);
		}
		else {
			if (random == 1) {
				premio = new Objeto_precioso(j);
			}else {
				premio = null;
			}
		}
	}
	
	// si al recibir daño, se desinfecta y además tiene premio, dropeamos premio en
	// la pos posactual
	public boolean esta_infectado() {
		boolean es = false;
		if (carga_viral > 0) {
			es = true;
		}
		return es;
	}

	public void mover() {
		movimiento.mover();
	}

	public void lanzar_particula() {
		
	}
	
	@Override
	public void accionar() {
		//lanzar particula
		//moverse
		if (carga_viral > 0) {
			this.mover();
			disparar();
		}
		
	}
	
	public void disparar() {
		if (this.cooldown == 0) {
			lanzar_particula();
			// TERMINAR
		}else {
			this.cooldown-=1;
		}
	}

}
