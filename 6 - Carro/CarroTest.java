package yn.ex160426;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    
    public CarroTest() {
    }

    @Test
    public void testCarro() {
        Carro carro = new Carro();
        
        carro.acelerar();
        System.out.println(carro.getVelocidade());
        
        carro.frear();
        System.out.println(carro.getVelocidade());
    }
    
}
