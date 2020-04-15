package trabalho;

public class App {
    public static void main(String[] args) {
        JogadorDeFutebol futebol = new JogadorDeFutebol();
        futebol.treino();

        JogadorDeVolei volei = new JogadorDeVolei();
        volei.treino();

        JogadorDeFutsal futsal = new JogadorDeFutsal();
        futsal.treino();
    }
}