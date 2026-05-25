package Personaje;

public class Ninja extends Personaje {
	
    public Ninja(String nombre) {
        super(nombre, 100, 21, 10);
    }
    
    
    public void DisparoDoble(Personaje enemigo) {

        System.out.println(getNombre() + " usa Disparo Doble.");

        enemigo.recibirDaño(25);

        System.out.println("¡Causó 25 de daño!");
    }
    
    }
