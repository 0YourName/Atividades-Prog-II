package yn.trigonometria;

public class Triangulo {

    double altura;
    double base;

    public Triangulo() {
        altura = 0.0;
        base = 0.0;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
