package yn.veiculo;

public class Carro extends Veiculo{
    Integer portas;
    
    public Carro(){
        super();
        portas = 4;
    }
    
    public Carro(String marca, Integer ano, double valor, Integer portas){
        super(marca, ano, valor);
        setPortas(portas);
    }
    
    public Integer getPortas(){
        return portas;
    }
    
    public final void setPortas(Integer portas){
        if(portas > 6){
            this.portas = 6;
            return;
        }
        this.portas = portas;
    }
    
    @Override
    public double calcularIPVA(){
        Integer fabricacao = 2026 - this.ano;
        if (fabricacao < 20) {
            return getValor() * 0.02;
        }
        return 0;
    }
}
