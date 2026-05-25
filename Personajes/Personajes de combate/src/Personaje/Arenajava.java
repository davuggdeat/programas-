package Personaje;

public class Arenajava {

	public static void main(String[] args) {
		
		Ninja ninja = new Ninja("Shirai Ryu");
        Guerrero guerrero = new Guerrero("Thor");
		
		System.out.println("Comienza la batalla en la Arena Java");
		System.out.println();
		
		ninja.mostrarEstado();
        guerrero.mostrarEstado();
        
		while (ninja.estaVivo() && guerrero.estaVivo()) {

			double azar = Math.random();

		     if (azar < 0.4) {

				ninja.DisparoDoble(guerrero);

			} else {

				ninja.atacar(guerrero);
			}

			if (guerrero.estaVivo()) {           
				guerrero.atacar(ninja);
			}
		
		
			ninja.mostrarEstado();
			guerrero.mostrarEstado();
		
		}
		if (ninja.estaVivo()) {
			System.out.println("Ganó " + ninja.getNombre());
		} else {
			System.out.println("Ganó " + guerrero.getNombre());
		}
	}
	}
