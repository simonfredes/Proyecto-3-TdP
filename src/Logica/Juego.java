package Logica;

import java.util.List;

import GUI.gameGUI;
import Nivel.Nivel;

public class Juego {
	protected Mapa map;
	protected gameGUI gui;

	protected Jugador player;

	protected Nivel[] niveles;
	protected int nivel_actual;

	protected Entidad entidad;

	public Juego(gameGUI gui) {
		player = new Jugador(null, nivel_actual, null, null, null, null);
		this.gui = gui;
	}

	public Jugador getPlayer() {
		return player;
	}

	public gameGUI getGui() {
		return gui;
	}

	public Nivel get_nivel_actual() {
		return niveles[nivel_actual];
	}

	public void accionar() {
		List<Entidad> lista_activos = map.get_objetos_activos();
		
		for(Entidad e : lista_activos) {
			e.accionar();
		}
	}

	// metodo agregar

}