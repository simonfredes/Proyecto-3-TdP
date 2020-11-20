package Nivel;

import java.util.List;

import Logica.Infectado;

public abstract class Nivel {
	protected int cant_infectados;
	protected List<Infectado> lista_infectados;
	
	public List<Infectado> get_lista_infectados(){
		return lista_infectados;
	}
	
	public  int get_cant_infectados() {
		return cant_infectados;
	}
}
