package yn.veiculo;

public class Caminhao extends Veiculo {

    double carga;

    public Caminhao() {
        super();
        carga = 0.0;
    }

    public Caminhao(String marca, Integer ano, double valor, double carga) {
        super(marca, ano, valor);
        this.carga = carga;
    }
    
    public double getCarga(){
        return carga;
    }
    
    public void setCarga(double carga){
        this.carga = carga;
    }
    
    @Override
    public double calcularIPVA() {
        Integer fabricacao = 2026 - this.ano;
        if (fabricacao < 20) {
            return getValor() * 0.04;
        }
        return 0;
    }
}
