package Personaje;

public class Ares extends Personaje {
	
    // CONSTRUCTOR
    public Ares(String nombre) {
        super(nombre, 100, 30, 10);
    }

    // MÉTODO ESPECIAL
    public void golpeDoble(Personaje enemigo) {
        int dañoEspecial = (60) - enemigo.getDefensa();
        
        enemigo.recibirDaño(dañoEspecial);
        
        System.out.println(getNombre() + " usa Golpe Doble sobre " + enemigo.getNombre() + " y causa " + dañoEspecial + " de daño.");
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        golpeDoble(enemigo);
    }
}
