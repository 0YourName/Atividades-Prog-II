package yn.robo;

public class RoboPlutoniano extends RoboMarciano {

    Integer balas;

    public RoboPlutoniano() {
        super();
        this.balas = 0;
    }

    public RoboPlutoniano(Integer codigo, String nome, Integer x, Integer y, Integer balas) {
        super(codigo, nome, x, y);
        this.balas = balas;
    }

    public Integer getBalas() {
        return balas;
    }

    public void setBalas(Integer balas) {
        this.balas = balas;
    }

    public void atirar() {
        if (balas > 0) {
            balas--;
        }
    }

    public void recarregar(Integer balas) {
        this.balas += balas;
    }

    @Override
    public String toString() {
        return "Sou um robo plutoniano";
    }

}
