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
		
		if (daño < 0) 
			daño = 0;	
		enemigo.recibirDaño(daño);
		System.out.println(nombre + " ataco a " + enemigo.nombre + " causando " + daño + " de  daño.");
		
		}
	
	public void recibirDaño(int daño) {
		vida = vida - daño;
		
		if (vida < 0) 
			vida = 0;
		}
	
	
	public void mostrarEstado() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Vida: " + vida);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defensa: " + defensa);
		System.out.println("-----------------------");
	}
	
	public boolean estaVivo() {
	return vida > 0;
	
	}

    public String getNombre() {
    	return nombre;
    }
    
    public int getVida() { 
    	return vida;
    }
    
    public int getAtaque() {
    	return ataque;
    }
    
    public int getDefensa() { 
    	return defensa; 
    }
}
