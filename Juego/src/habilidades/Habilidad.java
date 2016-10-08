package habilidades;

import personaje.Personaje;

public abstract class Habilidad {
	protected int costo;
	protected int ataqueBasico;
	public abstract void afectar(Personaje personaje);
	public int getCosto() {
		return costo;
	}
}
