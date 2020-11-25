package Logica;

import java.util.List;

import GUI.gameGUI;
import Nivel.Nivel;
import Nivel.Nivel_1;
import Nivel.Nivel_2;

public class Juego {
	protected Mapa map;
	protected gameGUI gui;
	protected Jugador jugador;

	protected Nivel[] niveles;
	protected int nivel_actual;

//	protected Entidad entidad;
	protected boolean juego_activo;

	public Juego(gameGUI gui) {
		this.map = new Mapa();
		this.jugador = new Jugador(this);
		this.gui = gui;
		this.juego_activo = true;
		this.niveles = new Nivel[2];
		this.niveles[0] = new Nivel_1();
		this.niveles[1] = new Nivel_2();
		this.nivel_actual = 0;
	}

	public Jugador getPlayer() {
		return jugador;
	}

	public gameGUI getGui() {
		return gui;
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
		List<Entidad> entidades_activas = map.getEntidades_activos();

		for (Entidad e : entidades_activas) {
			e.accionar();
		}
	}

	public Mapa getMap() {
		return map;
	}
}