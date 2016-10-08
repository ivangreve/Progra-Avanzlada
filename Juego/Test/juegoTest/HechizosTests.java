package juegoTest;

import org.junit.Assert;
import org.junit.Test;

import habilidades.PiroExplosion;
import personaje.Personaje;
import raza.Mognatal;

public class HechizosTests {

	@Test
	public void quePuedoAgregarHechizos() {
		Mognatal gandalf = new Mognatal();
		gandalf.setCastaMago();
		Assert.assertEquals(0, gandalf.getCasta().getCantidadDeHabilidades());
		gandalf.getCasta().agregarHabilidad("piroExplosion", new PiroExplosion());
		Assert.assertEquals(1, gandalf.getCasta().getCantidadDeHabilidades());
	}

	@Test
	public void queUnPersonajePuedeHechizarPorNombre() {
		Mognatal gandalf = new Mognatal();
		gandalf.setCastaMago();
		gandalf.getCasta().agregarHabilidad("piroExplosion", new PiroExplosion());
		Personaje gimli = new Mognatal();
		Assert.assertEquals(120, gimli.getSaludActual());
		gandalf.getCasta().lanzarHabilidad("piroExplosion", gimli);
		// Piro Explosion quita 20 puntos de vida. 
		Assert.assertEquals(100, gimli.getSaludActual());
	}

}
