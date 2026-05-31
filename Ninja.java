package Personaje;

public class Ninja extends Personaje {
	
	private boolean escondido = false;

    public Ninja(String nombre) {
        super(nombre, 100, 23, 10);
    }
    
    
    public void DisparoDoble(Personaje enemigo) {

        System.out.println(getNombre() + " usa Disparo Doble.");

        enemigo.recibirDaño(31);

        System.out.println("¡Causó 31 de daño!");
    }
    
    
 // NUEVA HABILIDAD (Evadiendo el ataque)
    public void esconderse(Personaje enemigo) {

        escondido = true;

        System.out.println(getNombre() + " se escondió entre las sombras.");
        
        int daño = 18;

        
		enemigo.recibirDaño(daño);

        System.out.println(getNombre()  + " atacó desde las sombras causando " + daño + " de daño.");
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        DisparoDoble(enemigo);
    }
    
    public boolean estaEscondido() {
        return escondido;
    }

    public void salirEscondite() {
        escondido = false;
    }
		
}

   
