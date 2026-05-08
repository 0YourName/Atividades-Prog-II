package yn.linha;

public class Main {
    public static void main(String[] args) {
        Linha linha1 = new Linha();
        Linha linha2 = new Linha(10);
        
        linha1.desenhar();
        linha2.desenhar();
    }
}
