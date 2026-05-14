package Personaje;

public class Ninja extends Personaje{

	public Ninja(String nombre) {
	    super(nombre, 100, 19, 8);

      }

	public void DisparoDoble(Personaje enemigo) {
		System.out.println(getNombre() + " usa DisparoDoble.");
		enemigo.recibirDaño(27);
      }

   }
	