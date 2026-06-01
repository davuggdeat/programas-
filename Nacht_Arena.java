package Personaje;

public class Nacht_Arena extends Personaje {

    public Nacht_Arena() {
        super("Nacht", 100, 28, 7);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {

        System.out.println();
        System.out.println(getNombre()
                + " invoca el poder de las sombras.");

        System.out.println("¡MODO DEMONIO ACTIVADO!");

        System.out.println("Un aura oscura envuelve el campo de batalla.");

        System.out.println("Nacht golpea al enemigo con energía demoníaca.");

        enemigo.recibirDaño(45);
    }
}
