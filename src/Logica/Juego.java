package Logica;

import java.util.List;

import GUI.gameGUI;
import Nivel.Nivel;
import Nivel.Nivel_1;
import Nivel.Nivel_2;

public class Juego extends Thread{
	protected Mapa map;
	protected gameGUI gui;
	protected Jugador player;
	
	protected Nivel[] niveles;
	protected int nivel_actual;
	
	protected Entidad entidad;
	protected boolean juego_activo;
	

	public Juego(gameGUI gui) {
		player = new Jugador(this);
		this.gui = gui;
		juego_activo = true;
		
		niveles = new Nivel[2];
		niveles[0] = new Nivel_1();
		niveles[1] = new Nivel_2();
		nivel_actual = 0;
	}

	public Jugador getPlayer() {
		return player;
	}

	public gameGUI getGui() {
		return gui;
	}

	public int get_nivel_actual() {
		return nivel_actual;
	}
	
	public void avanzar_nivel() {
		if (nivel_actual < niveles.length) {
			nivel_actual +=1 ;
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
		
		for(Entidad e : entidades_activas) {
			e.accionar();
		}
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}			
			map.actualizar();		
		}
	}

	
}