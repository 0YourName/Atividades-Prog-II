package yn.trigonometria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrigonometriaTest {

    public TrigonometriaTest() {
    }

    @Test
    public void testTrigonometria() {
        Triangulo triangulo = new Triangulo(2, 5);
        Circulo circulo = new Circulo(4);

        System.out.println(Trigonometria.calcularArea(triangulo));
        System.out.println(Trigonometria.calcularArea(circulo));
    }

}
