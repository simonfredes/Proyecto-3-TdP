package Logica;

import GUI.gameGUI;

public class HiloGeneral extends Thread {
	protected gameGUI game_gui;
	protected Juego juego;

	public HiloGeneral() {
		/*
		 * por cada iteracion del hilo accionar() para que cada entidad del juego
		 * realice su comportamiento
		 */
		game_gui = new gameGUI();
		juego = this.game_gui.getJuego();
		this.start();
	}
	
	public gameGUI getGame_gui() {
		return game_gui;
	}
	
	public Juego getJuego() {
		return juego;
	}

	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
		juego.accionar();
	}
}