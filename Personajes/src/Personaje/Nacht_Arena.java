package Personaje;

public class Nacht_Arena extends Personaje {

    public Nacht_Arena(String nombre) {
        super("Nacht", 100, 28, 7);
    }

    
    public void modoDemonio(Personaje enemigo) {
    	
    	int daño = 45;
    	 enemigo.recibirDaño(daño);
    	 
        System.out.println();
        System.out.println(getNombre()
                + " invoca el poder de las sombras.");

        System.out.println("¡MODO DEMONIO ACTIVADO!");

        System.out.println("Un aura oscura envuelve el campo de batalla.");

        System.out.println("Nacht golpea al enemigo con energía demoníaca causando " + daño + " de daño. ");
    }
    
    @Override
    public void habilidadEspecial(Personaje enemigo) {
        modoDemonio(enemigo);
    }
}
