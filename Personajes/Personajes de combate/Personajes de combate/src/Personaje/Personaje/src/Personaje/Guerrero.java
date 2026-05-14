package Personaje;

public class Guerrero extends Personaje{
	
	public Guerrero(String nombre) {
		super(nombre, 100, 28, 10);
	}

	public void golpreFuerte(Personaje enemigo ) {
		System.out.println(getNombre() + "usa Golpe Fuerte.");
		enemigo.recibirDaño(35);
	}
}