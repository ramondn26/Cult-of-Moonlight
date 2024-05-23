package ppoo.seuJogo;

public class Mao extends Arma implements Equipavel{
    private double danoSoco = 5;

    public Mao(String nome, String descricao, int durabilidade) {
        super(nome, descricao, durabilidade);
    }

    @Override
    public void equipado(Jogador jogador) {
        System.out.println("Mão:");
        System.out.println("Você está de mãos vazias.");
        System.out.println("Dano do soco: " + danoSoco);
    }
}
