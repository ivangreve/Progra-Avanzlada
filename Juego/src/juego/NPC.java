package juego;

public class NPC implements Atacable {
	protected int energia = 100;
	protected int salud = 100;
	
	@Override
	public void serAtacado(int danio){
		this.salud -= danio;
	}

	@Override
	public void morir() {	
		//aca se puede disparar el re-spaw en tantos segudos.
	}
	
	
}
