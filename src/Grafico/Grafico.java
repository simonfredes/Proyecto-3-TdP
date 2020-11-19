package Grafico;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Grafico extends JLabel {

	protected ImageIcon grafico;
	protected String[] imagenes;

	protected Grafico() {
		this.grafico = new ImageIcon();
	}

	public ImageIcon getGrafico() {
		return grafico;
	}

	public void setGrafico(ImageIcon grafico) {
		this.grafico = grafico;
	}

	public String[] getImagenes() {
		return imagenes;
	}

	public void setImagenes(String[] imagenes) {
		this.imagenes = imagenes;
	}

	public void setImagen(int img) {

		if (img < this.imagenes.length) {
			ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(this.imagenes[img]));
			this.grafico.setImage(imageIcon.getImage());
			this.setIcon(imageIcon);
		}
	}
}