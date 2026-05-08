package yn.caixa;

public class Caixa {
    double largura;
    double altura;
    double profundidade;
    
    Caixa(){
        largura = 0;
        altura = 0;
        profundidade = 0;
    }
    
    public double calcularVolume(){
        return largura * altura * profundidade;
    } 
}
