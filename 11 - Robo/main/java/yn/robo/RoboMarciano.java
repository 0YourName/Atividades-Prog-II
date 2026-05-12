package yn.robo;

public class RoboMarciano extends Robo {

    public RoboMarciano() {
        super();
    }

    public RoboMarciano(Integer codigo, String nome, Integer x, Integer y) {
        super(codigo, nome, x, y);
    }

    public void teleportar(Integer x, Integer y) {
        setX(x);
        setY(y);
    }

    @Override
    public String mostrarPosicao() {
        return "Posiçao [" + getX() + "," + getY() + "]";
    }

    @Override
    public String toString() {
        return "Sou um robo marciano";
    }
}
