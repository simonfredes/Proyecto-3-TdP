package Logica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Grafico.Grafico;

public class Mapa extends JPanel {

	public static final int LIMITE_IZQ_X = 0;
	public static final int LIMITE_DER_X = 590;
	public static final int LIMITE_INFERIOR = 570;
	public static final int LIMITE_SUPERIOR = 0;

//	protected List<Entidad> entidades_activos;
//	protected List<Entidad> entidades_insertar;
//	protected List<Entidad> entidades_eliminar;
	//	protected boolean juego_activo;
	protected int cantidadEnemigos;
	protected JLabel background;
	protected Juego juego;
	
	public Mapa(Juego juego) {
//		entidades_activos = new LinkedList<Entidad>();
//		entidades_insertar = new LinkedList<Entidad>();
//		entidades_eliminar = new LinkedList<Entidad>();
//		this.juego_activo = true;
		this.background = new JLabel();
		this.background.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		this.background.setIcon(new ImageIcon(this.getClass().getResource("/Texturas/fondo2.jpg")));
		this.add(background);
		this.setComponentZOrder(this.background, 0);
		this.juego = juego;
	}
	
	

	public void insertarGrafico(Grafico g) {
		this.add(g);
	}
	
	public void eliminar_Grafico(Grafico g) {
		this.remove(g);
		this.repaint();
	}

	//ACTUALIZA LA GRAFICA
	public void actualizar() {
//		// TODO hacer lo mismo con entidades_insertar
//
//		if (juego_activo) {
//			if (ganoJuego()) {
//				juego_activo = false;
//			}
//			for (Entidad e : entidades_eliminar) {
//				eliminar_Grafico(e.getGrafico()); //de mapa
//				entidades_eliminar.remove(e);
//			}
//
//			for (Entidad e : entidades_insertar) {
//				entidades_activos.add(e);
//			}
//			this.entidades_insertar = new LinkedList<Entidad>();
//
//			for (Entidad e : entidades_activos) {
//				e.accionar();
//			}
//		}
	}

	private boolean ganoJuego() {
		// TODO cuando eliminamos todos los enemigos, ganar el nivel, si el nivel es el
		// ultimo, ganar juego.
		return false;
	}

}