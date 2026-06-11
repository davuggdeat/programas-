package Personajes;

import java.util.Scanner;

public class Arenajava {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== ELIGE TU PERSONAJE ===");
        System.out.println("1. Ninja");
        System.out.println("2. Guerrero");
        System.out.println("3. Androide");
        System.out.println("4. Pokemon");
        System.out.println("5. Ares");
        System.out.println("6. Nacht");

        int opcion = entrada.nextInt();

        Personaje jugador;

        switch (opcion) {

            case 1:
                jugador = new Ninja("Shirai Ryu");
                break;

            case 2:
                jugador = new Guerrero("Thor");
                break;

            case 3:
                jugador = new Androide("Caster 17");
                break;

            case 4:
                jugador = new Pokemon("Charizard");
                break;

            case 5:
                jugador = new Ares("Ares");
                break;

            case 6:
                jugador = new Nacht_Arena("Nacht");
                break;

            default:
                System.out.println("Opción inválida.");
                entrada.close();
                return;
        }

        Personaje[] enemigos = {
                new Ninja("Shirai Ryu"),
                new Guerrero("Thor"),
                new Androide("Caster 17"),
                new Pokemon("Nidorey"),
                new Ares("Ares"),
                new Nacht_Arena("Nacht")
        };

        System.out.println("Elegiste a " + jugador.getNombre());

        for (Personaje enemigo : enemigos) {

            if (enemigo.getClass() == jugador.getClass()) {
                continue;
            }

            System.out.println("========================");
            System.out.println("BATALLA CONTRA " + enemigo.getNombre());
            System.out.println("========================");

            jugador.restaurarVida();
            enemigo.restaurarVida();

            while (jugador.estaVivo() && enemigo.estaVivo()) {

                // Turno del jugador que elegimos 
                if (Math.random() < 0.30) {

                    if (jugador instanceof HabilidadEspecial) {
                        ((HabilidadEspecial) jugador)
                                .habilidadEspecial(enemigo);
                    }

                } else {
                    jugador.atacar(enemigo);
                }

                if (!enemigo.estaVivo()) {
                    break;
                }

                // Turno del enemigo
                if (Math.random() < 0.30) {

                    if (enemigo instanceof HabilidadEspecial) {
                        ((HabilidadEspecial) enemigo)
                                .habilidadEspecial(jugador);
                    }

                } else {
                    enemigo.atacar(jugador);
                }

                System.out.println();

                jugador.mostrarEstado();
                enemigo.mostrarEstado();
            }

            if (!jugador.estaVivo()) {

                System.out.println(" " + jugador.getNombre() + " fue derrotado.");

                System.out.println("FIN DEL TORNEO.");

                entrada.close();
                return;
            }

            System.out.println("¡Venciste a " + enemigo.getNombre() + "!");

            jugador.restaurarVida();

            System.out.println("La vida de "  + jugador.getNombre() + " fue restaurada a 100.");
        }

        System.out.println("¡¡FELICIDADES!!");
        System.out.println(jugador.getNombre() + " derrotó a todos los personajes.");

        entrada.close();
    }
}