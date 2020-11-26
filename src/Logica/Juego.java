package Logica;

import java.util.LinkedList;
import java.util.List;

import GUI.gameGUI;
import Nivel.Nivel;
import Nivel.Nivel_1;
import Nivel.Nivel_2;

/*
 * -que el mapa se encargue de la grafica
 * 
 * 
 */
public class Juego {
	protected Mapa mapa;
	protected gameGUI gui;
	protected Jugador jugador;
	protected Nivel[] niveles;
	protected int nivel_actual;
	protected List<Entidad> entidadesActivas;
	protected List<Entidad> entidadesInsertar;
	protected List<Entidad> entidadesEliminar;
	protected boolean juego_activo;

	public Juego(gameGUI gui) {
		this.mapa = new Mapa();
		this.gui = gui;
		this.jugador = new Jugador();
		this.niveles = new Nivel[2];
		this.niveles[0] = new Nivel_1();
		this.niveles[1] = new Nivel_2();
		this.nivel_actual = 0;
		this.entidadesActivas = new LinkedList<Entidad>();
		this.entidadesInsertar = new LinkedList<Entidad>();
		this.entidadesEliminar = new LinkedList<Entidad>();
		this.juego_activo = true;
	}

	public void insertarEntidadActiva(Entidad entidad) {
		this.entidadesActivas.add(entidad);
		this.mapa.insertarGrafico(entidad.getGrafico()); // inserta el grafico de la entidad a la grafica
	}

	public void insertarEntidadEliminar(Entidad e) {
		this.entidadesEliminar.add(e);
	}

	public void insertarEntidadInsertar(Entidad e) {
		this.entidadesInsertar.add(e);
	}

	public Jugador getPlayer() {
		return jugador;
	}

	public gameGUI getGui() {
		return gui;
	}

	public Mapa getMap() {
		return mapa;
	}

	public Nivel get_nivel_actual() {
		return niveles[nivel_actual];
	}

	public void avanzar_nivel() {
		if (nivel_actual < niveles.length) {
			nivel_actual += 1;
		}
	}

	public boolean isJuego_activo() {
		return juego_activo;
	}

	public void setJuego_activo(boolean juego_activo) {
		this.juego_activo = juego_activo;
	}

	public void accionar() {
		for (Entidad e : this.entidadesActivas) {
			e.accionar();
		}
	}

	public void generarDisparo(Proyectil disparo) {
		this.insertarEntidadActiva(disparo);
	}
}