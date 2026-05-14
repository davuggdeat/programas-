package Personaje;

public class Arenajava {

	public static void main (String[]args) {
		
		Personaje jugador1 = new Personaje("Guerrero Azul", 100, 25, 8);
		Personaje jugador2 = new Personaje("mago rojo", 100, 22, 5);
		
		System.out.println("Comienza la batalla en la Arena Java");
		System.out.println();
		
		jugador1.mostrarEstado();
		jugador2.mostrarEstado();
		
		while (jugador1.estaVivo() && jugador2.estaVivo()) {
			   jugador1.atacar(jugador2);
			
			if(jugador2.estaVivo()) {
				jugador2.atacar(jugador1);
			}
			
			jugador1.mostrarEstado();
			jugador2.mostrarEstado();
		}
		
		if (jugador1.estaVivo()) {
			 System.out.println("Gano" + jugador1.getNombre());
		} else {
			System.out.println("Gano" + jugador2.getNombre());
		}
	}
}
