package yn.robo;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Robo {

    private Integer codigo;
    private String nome;
    private Integer x;
    private Integer y;

    public Robo() {
        this.codigo = 0;
        this.nome = "";
        this.x = ThreadLocalRandom.current().nextInt(0, 21);
        this.y = ThreadLocalRandom.current().nextInt(0, 21);
    }

    public Robo(Integer codigo, String nome, Integer x, Integer y) {
        this.codigo = codigo;
        this.nome = nome;
        this.setX(x);
        this.setY(y);
    }

    public void andarParaFrente() {
        setX(getX() + 1);
    }

    public void andarParaTras() {
        setX(getX() - 1);
    }

    public void andarParaCima() {
        setY(getY() - 1);
    }

    public void andarParaBaixo() {
        setY(getY() + 1);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getX() {
        return x;
    }

    public final void setX(Integer x) {
        if (x < 0 || x > 20) {
            return;
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public final void setY(Integer y) {
        if (y < 0 || y > 20) {
            return;
        }
        this.y = y;
    }

    public abstract String mostrarPosicao();

    @Override
    public String toString() {
        return "Sou um robo comum";
    }

}
