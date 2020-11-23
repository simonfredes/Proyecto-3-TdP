package Logica;

public class Particula extends Entidad{
	
	protected int rango;
	
	public Particula(Juego j) {
		super(j);
		this.velocidad = 10;
		rango = 5;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
	
	public Particula lanzar_particula() {
		return new Particula(juego);
	}

}