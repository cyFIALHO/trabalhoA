package trabalho;

public class JogadorDeFutsal extends Jogador {

    @Override
    public void treinarNaAcademia() {
        System.out.println("Treino de fortalecimento muscular pela manhã");
    }

    @Override
    public void repousar() {
        System.out.println("Repouso de duas horas pós treino de fortalecimento");
    }

    @Override
    public void treinarNoGinasio() {
        System.out.println("Treinamento físico");
    }

    @Override
    public void prepararParaOJogo() {
        System.out.println("Concentrar com a EQUIPE");
    }

    @Override
    public void Jogar() {
        System.out.println("BORA PRO JOGO!!!");
    }

}