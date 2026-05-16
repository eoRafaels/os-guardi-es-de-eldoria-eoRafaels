public abstract class Personagem {
    String nome;
    ClassePersonagem classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public enum ClassePersonagem {
        GUERREIRO, MAGO, ARQUEIRO
    }

    public Personagem(String nome, ClassePersonagem classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    public int getNivel() {
        return nivel;
    }

    public double getpoderBase() {
        return poderBase;
    }

    public double calcularPoderTotal() {
        return nivel * poderBase;
    }

    public String getDescricaoBase() {
        return "Nome: " + nome + " | Nível: " + nivel;
    }

    public abstract void usarHabilidadeEspecial();

    public abstract String exibirDescricaoCompleta();
}
