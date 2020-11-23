package Logica;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import Nivel.Nivel;
import Nivel.Nivel_1;

public class Mapa extends JPanel{

	protected List<Entidad> entidades_activos;
	protected List<Entidad> entidades_insertar;
	protected List<Entidad> entidades_eliminar;
	

	public Mapa() {
		entidades_activos = new LinkedList<Entidad>();
		entidades_insertar = new LinkedList<Entidad>();
		entidades_eliminar = new LinkedList<Entidad>();
		
	}
	
	
	public void setEntidades_activos(Entidad e) {
		this.entidades_activos.add(e);
	}
	
	public void setEntidades_insertar(Entidad e) {
		this.entidades_insertar.add(e);
	}
	
	public List<Entidad> getEntidades_eliminar() {
		return entidades_eliminar;
	}
	
	public List<Entidad> getEntidades_activos() {
		return entidades_activos;
	}
	
	public List<Entidad> getEntidades_insertar() {
		return entidades_insertar;
	}
	
	public void insertar_objeto_activo(Entidad entidad) {
		entidades_activos.add(entidad);
	}
	
	//metodos para agregar entidades
	public void insertar_infectado(Infectado infectado) {
		
	}
	
	public void actualizar() {
		
	}

	
	
	
}