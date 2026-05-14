package yn.veiculo;

public abstract class Veiculo {

    String marca;
    Integer ano;
    double valor;

    public Veiculo() {
        marca = "";
        ano = 0;
        valor = 0.0;
    }

    public Veiculo(String marca, Integer ano, double valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calcularIPVA();
}
