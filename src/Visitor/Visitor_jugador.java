package Visitor;

import Logica.Alpha;
import Logica.Beta;
import Logica.Efecto_temporal;
import Logica.Jugador;
import Logica.Objeto_precioso;
import Logica.Particula;

public class Visitor_jugador extends Visitor{
	protected Jugador j;
	
	public void visit_alpha(Alpha a) {
		
	}
	public void visit_beta(Beta b) {
		
	}
	public void visit_particula(Particula p) {
		
	}
	public void visit_premio_obj_precioso(Objeto_precioso o) {
		
	}
	public void visit_premio_obj_temporal(Efecto_temporal e) {
		
	}
}
