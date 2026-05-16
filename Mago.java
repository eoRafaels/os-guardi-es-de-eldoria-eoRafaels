public class Mago extends Personagem {
    private int inteligencia;

    public Mago(String nome, int nivel, int inteligencia, int pontosDeVida, double poderbase) {
        super(nome,
                Personagem.ClassePersonagem.MAGO,
                nivel,
                pontosDeVida,
                poderbase); // Chama o construtor da classe Personagem
        this.inteligencia = inteligencia;
    }

    // Este método também reutiliza o método da classe pai
    public String exibirDescricaoCompleta() {
        return getDescricaoBase() + " | Inteligência: " + inteligencia;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("O mago " + nome + " lança Bola de Fogo!");
    }
}