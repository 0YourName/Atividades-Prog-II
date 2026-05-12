package yn.robo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboSolarTest {

    public RoboSolarTest() {
    }

    @Test
    public void testRoboSolar() {
        RoboSolar solar = new RoboSolar();

        System.out.println(solar.mostrarPosicao());
        System.out.println("Raio = " + solar.getRaio());
        solar.setRaio(true);
        System.out.println(solar.mostrarPosicao());
        System.out.println("Raio = " + solar.getRaio());
    }

}
