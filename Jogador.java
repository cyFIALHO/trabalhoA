package trabalho;

public abstract class Jogador {
    public Treinar void Treino(){
       treinarNaAcademia();
       repousar();
       treinarNoGinasio();
       prepararParaJogar();
       jogar();
    }

    public abstract void treinarNaAcademia();

    public abstract void repousar();

    public abstract void treinarNoGinasio();

    public abstract void prepararParaJogar();

    public abstract void jogar();
}