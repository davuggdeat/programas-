package Personaje;

public class Guerrero extends Personaje{
	
	public Guerrero(String nombre) {
		super(nombre, 100, 28, 10);
	}

	public void golpreFuerte(Personaje enemigo ) {
		System.out.println(getNombre() + "usa Golpe Fuerte.");
		
		int daño = 38; 
        enemigo.recibirDaño(daño);
        
        System.out.println("¡Causó " + daño + " de daño con su golpe!");
		
	}
	
	@Override
    public void atacar(Personaje enemigo) {
        int daño = getAtaque() - enemigo.getDefensa();
        if (daño < 0) daño = 0;
        
        enemigo.recibirDaño(daño);
        System.out.println(getNombre() + " ataca con su espada causando " + daño + " de daño.");
}
}
