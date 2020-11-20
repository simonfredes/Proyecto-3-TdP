package Logica;

import GUI.gameGUI;

public class Hilo extends Thread {
	protected gameGUI game_gui;
	protected Juego juego;

	public Hilo() {
		/*
		 * por cada iteracion del hilo accionar() para que cada entidad del juego
		 * realice su comportamiento
		 */
		
	}

	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
		juego.accionar();
	}
}