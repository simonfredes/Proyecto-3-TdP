package GUI;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Grafico.Grafico;
import Grafico.GraficoInfectado;
import Grafico.GraficoJugador;
import Logica.Juego;
import Logica.Mapa;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Color;

public class gameGUI extends JFrame {

	private Juego game;
	private JPanel mapa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					SplashScreen splash = new SplashScreen(300);
					splash.showSplash();
					
					gameGUI frame = new gameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public gameGUI() {
		game = new Juego(this);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		mapa = new Mapa();
		mapa.setBorder(new EmptyBorder(5, 5, 5, 5));//PASAR A MAPA
		setContentPane(mapa);
		mapa.setLayout(null);

		Grafico jugadorPrueba = new GraficoJugador();
		jugadorPrueba.setForeground(Color.BLACK);
		jugadorPrueba.setBackground(Color.BLACK);
		jugadorPrueba.setBounds(268, 344, 201, 204);
		mapa.add(jugadorPrueba);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Point posJugador = jugadorPrueba.getLocation();
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT: {
					game.getPlayer().moverAIzquierda();
					break;
				}
				case KeyEvent.VK_RIGHT: {
					game.getPlayer().moverADerecha();
					break;
				}
				}
				posJugador.setLocation(game.getPlayer().getX(), posJugador.getY());
				jugadorPrueba.setLocation(posJugador);
			}
		});

		Grafico infectadoPrueba = new GraficoInfectado();
		infectadoPrueba.setForeground(Color.BLACK);
		infectadoPrueba.setBackground(Color.BLACK);
		Random r = new Random();
		
		//int valor = r.nextInt()%mapa.getWidth();
		infectadoPrueba.setBounds(200, 0, 46, 55);
		mapa.add(infectadoPrueba);
		
		System.out.println("ancho: "+this.getWidth());
		
		

	}
	
	public int get_ancho() {
		return this.getWidth();
	}
}
