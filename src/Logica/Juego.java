package Logica;

import Nivel.Nivel;

public class Juego implements Runnable  {
	
	protected Jugador player;
	protected Nivel nivel;
	protected Entidad entidades;
	protected Mapa map;
	
	
	public Juego() {
		player=new Jugador();
	}
	public Jugador getPlayer() {
		return player;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
