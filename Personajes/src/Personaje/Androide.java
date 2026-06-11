package Personaje;

public class Androide extends Personaje {
		public Androide (String nombre) {
			super(nombre, 100, 30, 15);	
		}
		
		public void Super_Electric_Strike(Personaje enemigo) {
			System.out.println(getNombre() + " -- CASTER:  17 USA SUPER ELECTRIC STRIKE SACANDO 50 PUNTOS DE VIDA ");
			enemigo.recibirDaño(50);
		} 
		
		@Override
	    public void habilidadEspecial(Personaje enemigo) {
			Super_Electric_Strike(enemigo);
		}
		
}
