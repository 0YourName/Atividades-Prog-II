package yn.trigonometria;

public class Trigonometria {

    public static double calcularArea(Triangulo triangulo) {
        return triangulo.getBase() * triangulo.getAltura();
    }

    public static double calcularArea(Circulo circulo) {
        return Math.PI * Math.pow(circulo.getRaio(), 2);
    }
}
