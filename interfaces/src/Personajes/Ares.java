package Personajes;

public class Ares extends Personaje {

    public Ares(String nombre) {
        super(nombre, 100, 30, 10);
    }

    public void golpeDoble(Personaje enemigo) {

        int daño = 60 - enemigo.getDefensa();

        enemigo.recibirDaño(daño);

        System.out.println(getNombre() + " usa Golpe Doble y causa " + daño + " de daño.");
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        golpeDoble(enemigo);
    }
}