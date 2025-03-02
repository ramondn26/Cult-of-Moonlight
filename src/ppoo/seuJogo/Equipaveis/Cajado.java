package ppoo.seuJogo.Equipaveis;

import ppoo.seuJogo.Jogador;
import ppoo.seuJogo.DanosStrategy.DanoDeCajadoStrategy;
import ppoo.seuJogo.interfaces.Equipavel;

public class Cajado extends Arma implements Equipavel{

    public Cajado(String nome, double danoBase, String descricao, int durabilidade, String caminhoImagem) {
        super(nome, danoBase, descricao, durabilidade, "Mago", caminhoImagem);
        this.danoStrategy = new  DanoDeCajadoStrategy();
    }
    

    @Override
    public String equipado(Jogador jogador) {
        String nome = getNome();
        int durabilidade = getDurabilidade();
        String mensagem = "Cajado:\n";
        mensagem += "Você está equipado com o cajado: " + nome + "\n";
        mensagem += "Durabilidade: " + durabilidade + "\n";
        mensagem += "Dano de corte: " + getDanoBase() + "\n";
        
        return mensagem;
    }
    

    @Override
    public boolean equipar(Jogador jogador) {
        if (!jogador.getClasseJogador().equals("Mago")) {
            return false;
        }
        jogador.setArmaAtual(this);
        return true;
    }
}
