package Personajes;

public class Nacht_Arena extends Personaje {

    public Nacht_Arena(String nombre) {
        super(nombre, 100, 28, 7);
    }

    public void modoDemonio(Personaje enemigo) {

        int daño = 45;

        enemigo.recibirDaño(daño);

        System.out.println("¡MODO DEMONIO ACTIVADO!");
        System.out.println(getNombre() + " causa " + daño + " de daño.");
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        modoDemonio(enemigo);
    }
}