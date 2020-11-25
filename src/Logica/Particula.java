package Logica;

import Grafico.Grafico;
import Movimiento.Movimiento_vertical;
import Visitor.Visitor_particula;
/*
 * debax : yo creo que esta clase no deberia tener un
 * lanzar particulam, sino el infectado llame a lanzar particula,
 * cosa de poder ubicar la particula en el mapa, creo que seria
 * lo mismo para el premio
 */
public class Particula extends Entidad{
	protected int rango;
	
	public Particula(Juego j,Grafico grafico) {
		super(j);
		this.visitor = new Visitor_particula(this);
		this.movimiento = new Movimiento_vertical(this);
		this.grafico.setLocation(grafico.getLocation());
		this.velocidad = 10;
		rango = 5;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
}