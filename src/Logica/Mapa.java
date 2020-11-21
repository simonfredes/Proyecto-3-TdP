package Logica;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import Nivel.Nivel;
import Nivel.Nivel_1;

public class Mapa extends JPanel{
	protected Nivel nivel;
	protected List<Entidad> objetos_activos;
	

	public Mapa() {
		objetos_activos = new LinkedList<Entidad>();
		nivel = new Nivel_1();
	}
	
	public List<Entidad> get_objetos_activos(){
		return objetos_activos;
	}
	
	public void insertar_objeto_activo(Entidad entidad) {
		objetos_activos.add(entidad);
	}
	
	//metodos para agregar entidades
	public void insertar_infectado(Infectado infectado) {
		
	}
}