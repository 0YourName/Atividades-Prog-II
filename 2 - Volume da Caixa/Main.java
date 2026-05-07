package yn.caixa;

public class Main {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        
        caixa.altura = 10;
        caixa.largura = 2;
        caixa.profundidade = 4;
        
        System.out.println(caixa.calcularVolume());
    }

}
