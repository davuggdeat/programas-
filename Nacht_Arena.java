package arena;

public class Nacht_Arena extends Personaje {


    private int     mana;
    private boolean bonusAtaqueActivo = false;



    public Nacht_Arena() {
        super("Nacht", 100, 28, 7);
        this.mana = 80;
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (bonusAtaqueActivo) {
            setAtaque(getAtaque() + 15);
            System.out.println(getNombre() + " ▸ Proyectil de Mana  [BONUS DEMONIO]");
            System.out.println("  ⚡ sombras cargadas — +15 ataque este turno");
            super.atacar(enemigo);          
            setAtaque(getAtaque() - 15);   
            bonusAtaqueActivo = false;
        } else {
            System.out.println(getNombre() + " ▸ Proyectil de Mana");
            super.atacar(enemigo);
        }
    }

    public void golpeDeMana(Personaje enemigo) {
        System.out.println("── Golpe de Mana ──────────────────────────────");

        if (mana < 30) {
            System.out.println(getNombre() + " ▸ Golpe de Mana");
            System.out.println("  ✗ sin mana suficiente — usa ataque normal.");
            atacar(enemigo);
            return;
        }

        if (rand.nextInt(100) < 20) {
            System.out.println(getNombre() + " ▸ Golpe de Mana");
            System.out.println("  ✗ el hechizo se dispersa — falla. (−10 MP)");
            mana -= 10;
            System.out.println("  MP restante: " + mana);
            return;
        }

        int daño = 25 + rand.nextInt(21);   
        System.out.println("✦ " + getNombre() + " ▸ GOLPE DE MANA");
        System.out.println("  ↓ " + daño + " daño directo a " + enemigo.getNombre());
        enemigo.recibirDaño(daño);
        mana -= 30;
        System.out.println("  MP restante: " + mana);
    }

    public void modoDemonio(Personaje enemigo) {
        System.out.println("── Modo Demonio ────────────────────────────────");

        if (rand.nextInt(100) < 15) {
            System.out.println(getNombre() + " ▸ Modo Demonio");
            System.out.println("  ✗ las sombras no responden — habilidad falla.");
            return;
        }

        int cur        = 20 + rand.nextInt(11);   
        int dañoOscuro = 15 + rand.nextInt(11);   

        System.out.println("✦ " + getNombre() + " ▸ MODO DEMONIO");
        System.out.println("  ↓ " + dañoOscuro + " daño oscuro a " + enemigo.getNombre());
        enemigo.recibirDaño(dañoOscuro);

        this.curar(cur);                          
        bonusAtaqueActivo = true;

        System.out.println("  ↑ +" + cur + " HP absorbidos — Nacht: " + getVida() + " HP");
        System.out.println("  ⚡ próximo ataque cargado (+15 daño)");
    }



    @Override
    public void mostrarEstado() {
        super.mostrarEstado();                    
        System.out.println("  MP    : " + mana);
        System.out.println("  Bonus : " + (bonusAtaqueActivo ? "⚡ ACTIVO" : "inactivo"));
    }


    public int getMana() { return mana; }
}