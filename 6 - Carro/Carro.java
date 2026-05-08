package yn.ex160426;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private double velocidade;

    public Carro() {
        marca = "";
        modelo = "";
        ano = 0;
        velocidade = 0.0;
    }

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        velocidade = 0;
    }
    
    public String getMarca(){
        return marca;
    }
            
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
            
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Integer getAno(){
        return ano;
    }
            
    public void setAno(Integer ano){
        this.ano = ano;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
            
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        if (velocidade > 0) {
            velocidade -= 10;
        }
    }
}
