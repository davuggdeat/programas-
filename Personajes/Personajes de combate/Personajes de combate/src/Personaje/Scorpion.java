package Personaje;

public class Scorpion {

    // Atributos
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    // Constructor
    public Scorpion(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    // Método para atacar
    public void atacar() {
        System.out.println(nombre + " lanzó un ataque ninja de " + ataque + " puntos.");
    }

    // Poder especial
    public void dobleAtaque() {
        System.out.println(nombre + " usa DOBLE ATAQUE!");
        System.out.println("Primer golpe: " + ataque + " de daño.");
        System.out.println("Segundo golpe: " + ataque + " de daño.");
    }

    // Recibir daño
    public void recibirDanio(int dano) {
        int danoFinal = dano - defensa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        vida -= danoFinal;

        System.out.println(nombre + " recibió " + danoFinal + " de daño.");
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("===== PERSONAJE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

    // Main
    public static void main(String[] args) {

        Scorpion ninja = new Scorpion("Scorpion", 100, 25, 10);

        ninja.mostrarEstado();

        System.out.println();

        ninja.atacar();

        System.out.println();

        ninja.dobleAtaque();

        System.out.println();

        ninja.recibirDanio(30);

        System.out.println();

        ninja.mostrarEstado();
    }
}