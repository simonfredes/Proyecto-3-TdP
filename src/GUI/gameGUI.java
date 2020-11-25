package GUI;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Grafico.Grafico;
import Grafico.GraficoAlpha;
import Logica.HiloGeneral;
import Logica.Juego;
import Logica.Jugador;
import Logica.Mapa;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Color;
import javax.swing.ImageIcon;

public class gameGUI extends JFrame {

	private Juego juego;
	private JPanel contentPane;
	private Mapa labelMapa;
//	private static HiloGeneral hilo;
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
//					hilo = new HiloGeneral();
//					game = hilo.getJuego();
//					gameGUI frame = hilo.getGame_gui();
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
		juego = new Juego(this);

		Random random = new Random();

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

		Jugador jugador = juego.getPlayer();
		Grafico grafico_jugador = jugador.getGrafico();
		grafico_jugador.setBounds(jugador.get_x(), jugador.get_y(), grafico_jugador.getAncho(),
				grafico_jugador.getAlto());
		labelMapa.add(grafico_jugador);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Point posJugador = juego.getPlayer().getPosicion();

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT: {
					juego.getPlayer().moverAIzquierda();
					break;
				}
				case KeyEvent.VK_RIGHT: {
					juego.getPlayer().moverADerecha();
					break;
				}

				}
				posJugador.setLocation(juego.getPlayer().get_x(), juego.getPlayer().get_y());
				grafico_jugador.setLocation(posJugador);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_X: {
					juego.getPlayer().disparar();
					break;
				}
				}
			}
		});

		Grafico infectadoPrueba = new GraficoAlpha();
		infectadoPrueba.setForeground(Color.BLACK);
		infectadoPrueba.setBackground(Color.BLACK);

		int valor = random.nextInt(LIMITE_DER_X);
		// int valor = r.nextInt()%mapa.getWidth();
		infectadoPrueba.setBounds(valor, 0, 46, 55);
		labelMapa.add(infectadoPrueba);

	}

	public Juego getJuego() {
		return juego;
	}

	public int get_alto() {
		return labelMapa.getHeight();
	}

	public int get_ancho() {
		return labelMapa.getWidth();
	}
}
