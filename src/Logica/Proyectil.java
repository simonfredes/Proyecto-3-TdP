package Logica;

import Grafico.Grafico;
import Grafico.GraficoProyectilSanitario;
import Movimiento.Movimiento_vertical;
import Visitor.Visitor_proyectil;

public abstract class Proyectil extends Entidad{
	
	protected int cap_desinfeccion;
	
	public Proyectil(Grafico grafico) {
		this.visitor = new Visitor_proyectil();
		this.grafico = new GraficoProyectilSanitario();
		this.grafico.setLocation(grafico.getX()+ this.grafico.getAncho()/2 , grafico.getY() - this.grafico.getAlto()-2);
		this.movimiento = new Movimiento_vertical(this,Movimiento_vertical.ARRIBA);
	}
}