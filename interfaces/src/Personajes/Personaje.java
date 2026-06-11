package Personajes;

public abstract class Personaje implements HabilidadEspecial {

    private String nombre;
    private int vida;
    private int ataque;
    protected int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void atacar(Personaje enemigo) {

        int ataqueRonda = (int)(Math.random() * 11) + 20;
        int defensaRonda = (int)(Math.random() * 6) + 8;

        int daño = ataqueRonda - defensaRonda;

        if (daño < 0) {
            daño = 0;
        }

        enemigo.recibirDaño(daño);
        System.out.println(nombre + " atacó a " + enemigo.nombre + " causando "  + daño + " de daño.");
    }

    public void recibirDaño(int daño) {
    	

        if(this instanceof Esquivable) {

            Esquivable e = (Esquivable)this;

            if(e.esquivar()) {
                return;
            }
        }

        vida -= daño;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void restaurarVida() {
        vida = 100;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("-----------------------");
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

    public void setVida(int vida) {
        this.vida = vida;
    }
}