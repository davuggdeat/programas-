package Personaje;

public class Personaje {

	
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    
    // REFACTORIZACIÓN:
    // Se guarda la vida máxima para que restaurarVida() no dependa
    // de que todos los personajes tengan exactamente 100 de vida.
    private int vidaMaxima;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.defensa = defensa;		
    }

    public void atacar(Personaje enemigo) {
    	
    	int ataqueRonda = (int)(Math.random() * 11) + 20; // 20 a 30
        int defensaRonda = (int)(Math.random() * 6) + 8; // 8 a 13
        
        int daño = ataqueRonda - defensaRonda;
        
        if (daño < 0) {
            daño = 0;
        }
        
        enemigo.recibirDaño(daño);
        System.out.println(nombre + " atacó a " + enemigo.nombre + " causando " + daño + " de daño.");
    }
    
    public void recibirDaño(int daño) {
        setVida(getVida() - daño);
        
        if (getVida() < 0) {
            setVida(0);
        }
    }
    
    public void habilidadEspecial(Personaje enemigo) {
	    atacar(enemigo);
	}

    public void restaurarVida() {
        setVida(vidaMaxima);
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + getVida());
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("-----------------------");
    }
    public boolean estaVivo() {
        return getVida() > 0;
    }
    
 

    public String getNombre() {
    	return nombre; }
    
    public int getVida() { 
    	return vida; }
    
    public int getAtaque() { 
    	return ataque; }
    
    public int getDefensa() { 
    	return defensa; }

	public void setVida(int vida) {
		this.vida = vida;
	}
	
}