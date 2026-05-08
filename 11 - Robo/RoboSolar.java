package yn.robo;

public class RoboSolar extends Robo {

    private boolean raio;

    public RoboSolar() {
        super();
        raio = false;
    }

    public RoboSolar(Integer codigo, String nome, Integer x, Integer y, boolean raio) {
        super(codigo, nome, x, y);
        this.raio = raio;
    }

    public boolean getRaio() {
        return raio;
    }

    public void setRaio(boolean raio) {
        this.raio = raio;
    }

    @Override
    public String mostrarPosicao() {
        return "Posiçao [" + getX() + "," + getY() + "]";
    }

    @Override
    public String toString() {
        return "Sou um robo solar";
    }
}
