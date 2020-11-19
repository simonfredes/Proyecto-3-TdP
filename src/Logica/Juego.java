package Logica;

import GUI.gameGUI;
import Nivel.Nivel;

public class Juego {
	protected Mapa map;
	protected gameGUI gui;

	protected Jugador player;
	
	protected Nivel[] niveles;
	protected int nivel_actual;
	
	protected Entidad entidad;

	public Juego() {
		player = new Jugador();
	}

	public Jugador getPlayer() {
		return player;
	}

	public Nivel get_nivel_actual() {
		return niveles[nivel_actual];
	}
	
	public void accionar() {
		
	}
	
	//metodo agregar
	

}