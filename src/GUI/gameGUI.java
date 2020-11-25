package GUI;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Grafico.Grafico;
import Grafico.GraficoAlpha;
import Logica.Juego;
import Logica.Jugador;
import Logica.Mapa;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Color;
import javax.swing.ImageIcon;

public class gameGUI extends JFrame {

	private Juego game;
	private JPanel contentPane;
	private Mapa labelMapa;
	public static final int LIMITE_IZQ_X = 0;
	public static final int LIMITE_DER_X = 590;
	public static final int LIMITE_INFERIOR = 570;
	public static final int LIMITE_SUPERIOR = 0;

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
		setBounds(100, 100, 802, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// PASAR A MAPA
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ---------------- BARRA LATERAL DONDE VAN LAS OPCIONES ----------------
		JPanel barra_opciones = new JPanel();
		barra_opciones.setBounds(590, 0, 206, 571);
		contentPane.add(barra_opciones);

		// ---------------- MAPA ----------------
		labelMapa = new Mapa();
		labelMapa.setIcon(new ImageIcon(gameGUI.class.getResource("/Texturas/fondo2.jpg")));
		labelMapa.setBounds(0, 0, LIMITE_DER_X, LIMITE_INFERIOR);
		contentPane.add(labelMapa);

		Jugador jugador = this.game.getPlayer();
		Grafico grafico_jugador = jugador.getGrafico();
//		grafico_jugador.setForeground(Color.BLACK);
//		grafico_jugador.setBackground(Color.BLACK);
//		grafico_jugador.setBounds(214, 471, 100, 100);
		grafico_jugador.setBounds(jugador.get_x(), jugador.get_y(), grafico_jugador.getAncho(),
				grafico_jugador.getAlto());
		labelMapa.add(grafico_jugador);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Point posJugador = game.getPlayer().getPosicion();

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
				posJugador.setLocation(game.getPlayer().get_x(), game.getPlayer().get_y());
				grafico_jugador.setLocation(posJugador);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_X: {
					game.getPlayer().disparar();
					break;
				}
				}
			}
		});

		Grafico infectadoPrueba = new GraficoAlpha();
		infectadoPrueba.setForeground(Color.BLACK);
		infectadoPrueba.setBackground(Color.BLACK);

		Random r = new Random();
		// int valor = r.nextInt()%mapa.getWidth();
		infectadoPrueba.setBounds(200, 0, 46, 55);
		labelMapa.add(infectadoPrueba);

	}

	public Juego getGame() {
		return game;
	}

	public int get_alto() {
		return labelMapa.getHeight();
	}

	public int get_ancho() {
		return labelMapa.getWidth();
	}
}
