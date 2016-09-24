package juego;

public abstract class Personaje implements Atacable {

	protected int energia = 100;
	protected int salud = 100;
	protected int ataque = 1;
	protected int defensa = 0;
	
	public final void atacar(Atacable atacado) {
		if (puedeAtacar()) {
			int puntosDeAtaque = calcularPuntosDeAtaque();
			atacado.serAtacado(puntosDeAtaque);
			energia -= puntosDeAtaque;
			despuesDeAtacar();
		}
	}

	protected void despuesDeAtacar() { }

	protected abstract boolean puedeAtacar();
	protected abstract int calcularPuntosDeAtaque();
	public abstract int obtenerPuntosDeAtaque();
	public abstract int obtenerPuntosDeDefensa();
	
	public void serAtacado(int danio) {
		this.salud -= danio;
	}
	public void serCurado() {
		this.salud = 100;
	}

	public void serEnergizado() {
		this.energia = 100;
	}
	@Override
	public void morir() {

	}
	public boolean estaMuerto() {
		return salud <= 0;
	}

	
}
