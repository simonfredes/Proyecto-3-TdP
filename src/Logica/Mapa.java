package Logica;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import Grafico.Grafico;
import Nivel.Nivel;
import Nivel.Nivel_1;

public class Mapa extends JPanel{

	protected List<Entidad> entidades_activos;
	protected List<Entidad> entidades_insertar;
	protected List<Entidad> entidades_eliminar;
	protected boolean juego_activo;
	protected int cantidadEnemigos;
														
	public Mapa() {
		juego_activo=true;
		entidades_activos = new LinkedList<Entidad>();
		entidades_insertar = new LinkedList<Entidad>();
		entidades_eliminar = new LinkedList<Entidad>();
		
	}
	
	public void eliminar_Grafico(Grafico e) {
		remove(e);
		this.repaint();
	}

	public void setJuego_activo(boolean juego_activo) {
		this.juego_activo = juego_activo;
	}

	public void eliminarEntidad_activos(Entidad e) {
		entidades_eliminar.add(e);
		entidades_activos.remove(e);
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
	public boolean isJuego_activo() {
		return juego_activo;
	}
	
	public void actualizar() {		
		//TODO hacer lo mismo con entidades_insertar
		
		if (juego_activo) {
			if (ganoJuego()) {
				juego_activo=false;
			}
			for (Entidad e: entidades_eliminar) {
				eliminar_Grafico(e.getGrafico());
				entidades_eliminar.remove(e);
			}
			
			for (Entidad e: entidades_insertar) {
				entidades_activos.add(e);
				
			}
			
			for (Entidad e: entidades_activos) {
				e.accionar();
			}
		}
		
	}

	private boolean ganoJuego() {
	//TODO cuando eliminamos todos los enemigos, ganar el nivel, si el nivel es el ultimo, ganar juego.
	  return false;
	}

	
	
	
}