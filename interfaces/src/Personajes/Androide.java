package Personajes;

public class Androide extends Personaje {

    public Androide(String nombre) {
        super(nombre, 100, 30, 15);
    }

    public void SuperElectricStrike(Personaje enemigo) {

        System.out.println(getNombre() + " usa SUPER ELECTRIC STRIKE.");

        enemigo.recibirDaño(50);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        SuperElectricStrike(enemigo);
    }
}