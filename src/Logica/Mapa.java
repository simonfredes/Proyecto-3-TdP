package Logica;

import java.util.LinkedList;
import java.util.List;

public class Mapa {
	protected List<Entidad> objetos_activos;

	public Mapa() {
		objetos_activos = new LinkedList<Entidad>();
	}
	
	public List<Entidad> get_objetos_activos(){
		return objetos_activos;
	}
	
	public void insertar_objeto_activo(Entidad entidad) {
		objetos_activos.add(entidad);
	}
}