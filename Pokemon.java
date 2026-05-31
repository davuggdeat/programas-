package Personaje;

public class Pokemon extends Personaje {

    public Pokemon(String nombre) {
        super(nombre, 100, 25, 12);
    }
    
    public void BlazeRush(Personaje enemigo) {

        System.out.println(getNombre() + " usa Blaze Rush.");

        int daño = 15;

        if (Math.random() < 0.40) {
            daño *= 2;
            System.out.println("¡Golpe crítico!");
        }

        enemigo.recibirDaño(daño);

        System.out.println("¡Causó " + daño + " de daño ignorando la defensa!");
    }
    
    @Override
    public void habilidadEspecial(Personaje enemigo) {
        BlazeRush(enemigo);
    }
    
}