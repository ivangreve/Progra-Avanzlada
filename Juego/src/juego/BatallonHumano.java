package juego;

import java.util.LinkedList;

public class BatallonHumano extends Batallon {

	public BatallonHumano(int cant) {
		super(cant);
		batallon =  new LinkedList<Personaje>();

		for (int i = 0; i < cant; i++) {	
			batallon.add(new Humano());

		}
	}

	public void atacar(Batallon victimas){
		int i = 0;
		Personaje orco = victimas.batallon.get(i);


		for (Personaje humano: this.batallon) {
			humano.atacar( orco );
			i++;
			victimas.serAtacado(orco);
		}
	}


}
