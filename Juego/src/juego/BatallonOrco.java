package juego;

public class BatallonOrco extends Batallon {

	public BatallonOrco(int cant) {
		super(cant);
		for (int i = 0; i < cant; i++) {
			batallon.add(new Orco());
		}	
	}

	public void atacar(Batallon victimas){
		for (Personaje Orco: batallon) {
				Orco.atacar( victimas.batallon.get(0) );
	}
	}
}
