public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Aragorn", Personagem.ClassePersonagem.GUERREIRO, 10, 100, 50.0);
        Personagem personagem2 = new Personagem("Gandalf", Personagem.ClassePersonagem.MAGO, 20, 80, 70.0);

        personagem1.exibirStatus();
        personagem2.exibirStatus();
    }
}
