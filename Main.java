import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<Personagem>();
        Personagem personagem1 = new Guerreiro("Arthus", 10, 15, 100, 50.0);
        Personagem personagem2 = new Mago("Elenara", 20, 20, 80, 70.0);

        personagens.add(personagem1);
        personagens.add(personagem2);

        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
        }

        Grupo grupo = new Grupo(personagens);
        grupo.exibirPersonagens();
        grupo.batalhar(personagem1, personagem2);
    }
}
