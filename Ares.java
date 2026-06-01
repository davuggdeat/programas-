package Personaje;
public class Ares extends Personaje {

    // CONSTRUCTOR
    public Ares(String nombre) {
        super(nombre, 100, 30, 10);
    }

    // MÉTODO ESPECIAL
    public void golpeDoble(Personaje enemigo) {
        int danoEspecial = (ataque * 2) - enemigo.defensa;

        if (danoEspecial < 0) {
            danoEspecial = 0;
        }

        enemigo.vida -= danoEspecial;

        if (enemigo.vida < 0) {
            enemigo.vida = 0;
        }

        System.out.println(nombre + " usa Golpe Doble sobre " +
                enemigo.nombre + " y causa " + danoEspecial + " de daño.");
    }

}
