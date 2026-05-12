package yn.robo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboPlutonianoTest {
    
    public RoboPlutonianoTest() {
    }

    @Test
    public void testRoboPlutoniano() {
        RoboPlutoniano pluto = new RoboPlutoniano();
        
        pluto.recarregar(2);
        System.out.println(pluto.mostrarPosicao());
        System.out.println("Balas = " + pluto.getBalas());
        pluto.atirar();
        pluto.atirar();
        pluto.atirar();
        System.out.println("Balas = " + pluto.getBalas());
        pluto.recarregar(-2);
        System.out.println("Balas = " + pluto.getBalas());
    }
    
}
