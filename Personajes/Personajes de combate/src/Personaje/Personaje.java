package Personaje ;

public class Personaje {
	
	private String nombre;
	private int  vida;
	private int ataque;
	private int defensa;
	
	public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre =nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;		
	}

	public void atacar(Personaje enemigo) {
		int daño = ataque - enemigo.defensa;
		
		if (daño < 0) {
			daño = 0;
			
	    }
		
		enemigo.recibirDaño(daño);
		System.out.println(nombre + "atacó a " + enemigo.nombre + "causando" + daño + " de  daño.");
	}
	
	public void recibirDaño(int daño) {
		vida = vida - daño;
	}
}
