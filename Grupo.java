import java.util.*;

public class Grupo {
    private List<Personagem> personagens;

    public Grupo(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public List<Personagem> addPersonagem(Personagem personagem) {
        personagens.add(personagem);
        return personagens;
    }

    public List<Personagem> removePersonagem(Personagem personagem) {
        personagens.remove(personagem);
        return personagens;
    }

    public void exibirPersonagens() {
        for (Personagem p : personagens) {
            System.out.println(p.exibirDescricaoCompleta());
        }
    }

    public void batalhar(Personagem p1, Personagem p2) {
        double poderP1 = p1.calcularPoderTotal();
        double poderP2 = p2.calcularPoderTotal();

        System.out.println("Batalha entre " + p1.nome + " e " + p2.nome);
        System.out.println(p1.nome + " tem poder total: " + poderP1);
        System.out.println(p2.nome + " tem poder total: " + poderP2);

        Comparator<Double> comparador = new Comparator<Double>() {
            @Override
            public int compare(Double poderP1, Double poderP2) {
                return Double.compare(poderP1, poderP2);
            }
        };

        if (comparador.compare(poderP1, poderP2) > 0) {
            System.out.println(p1.nome + " vence a batalha!");
        } else if (comparador.compare(poderP1, poderP2) < 0) {
            System.out.println(p2.nome + " vence a batalha!");
        } else {
            System.out.println("A batalha terminou em empate!");
        }
    }
}
