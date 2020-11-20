package Logica;

public abstract class Personaje extends Entidad{
	protected float carga_viral;
	
	public abstract boolean esta_infectado();
	public abstract void recibir_danio(float d);

}