package yn.robo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboMarcianoTest {

    public RoboMarcianoTest() {
    }

    @Test
    public void testRoboMarciano() {
        RoboMarciano marciano = new RoboMarciano();
        System.out.println(marciano.mostrarPosicao());
        marciano.teleportar(5, 12);
        System.out.println(marciano.mostrarPosicao());
        marciano.teleportar(55, 122);
        System.out.println(marciano.mostrarPosicao());
    }

}
