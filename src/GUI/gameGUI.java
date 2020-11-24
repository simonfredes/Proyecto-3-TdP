package GUI;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Grafico.Grafico;
import Grafico.GraficoAlpha;
import Grafico.GraficoJugador;
import Logica.Juego;
import Logica.Mapa;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class gameGUI extends JFrame {
//hola
	private Juego game;
	private JPanel contentPane;
	private Mapa mapa;
	
	/**
	 * Launch the application. //
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
//					SplashScreen splash = new SplashScreen(300);
//					splash.showSplash();
					
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
		setBounds(100, 100, 718, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//PASAR A MAPA
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Grafico jugador_avion = new GraficoJugador();
		jugador_avion.setForeground(Color.BLACK);
		jugador_avion.setBackground(Color.BLACK);
		jugador_avion.setBounds(214, 471, 100, 100);
		mapa.add(jugador_avion);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Point posJugador = jugador_avion.getLocation();
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
				jugador_avion.setLocation(posJugador);
			}
		});

		Grafico infectadoPrueba = new GraficoAlpha();
		infectadoPrueba.setForeground(Color.BLACK);
		infectadoPrueba.setBackground(Color.BLACK);
		Random r = new Random();
		
		//int valor = r.nextInt()%mapa.getWidth();
		infectadoPrueba.setBounds(200, 0, 46, 55);
		mapa.add(infectadoPrueba);
		
		labelMapa = new JLabel("New label");
		labelMapa.setIcon(new ImageIcon(gameGUI.class.getResource("/Texturas/fondo2.jpg")));
		labelMapa.setBounds(0, 0, 594, 571);
		mapa.add(labelMapa);
		
		JPanel barraLateral = new JPanel();
		barraLateral.setBounds(593, 0, 119, 571);
		mapa.add(barraLateral);
		
		System.out.println("ancho: "+this.getWidth());

	}
	public int get_alto() {
		return labelMapa.getX();
	
	}
	public int get_ancho() {
		return this.getWidth();
	}
}
