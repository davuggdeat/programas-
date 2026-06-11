package Personaje;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 100, 28, 10);
    }

    public void golpeFuerte(Personaje enemigo) {
    	
    	 int daño = 35;
    	 
         enemigo.recibirDaño(daño);
         
        System.out.println(getNombre() + " usa Golpe Fuerte causando " + daño + " de daño. ");
       
    }
    
    @Override
    public void habilidadEspecial(Personaje enemigo) {
        golpeFuerte(enemigo);
    }

}