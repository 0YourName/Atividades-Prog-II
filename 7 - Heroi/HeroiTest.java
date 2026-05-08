package yn.ex160426;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroiTest {

    public HeroiTest() {
    }

    @Test
    public void testHeroi() {
        Heroi heroi = new Heroi();

        System.out.println(heroi.getVida());
        System.out.println(heroi.getVivo());

        heroi.atingido();
        heroi.atingido();

        System.out.println(heroi.getVida());
        System.out.println(heroi.getVivo());

        heroi.princesa();

        System.out.println(heroi.getVida());
        System.out.println(heroi.getVivo());

        heroi.atingido(); //13
        heroi.atingido(); //12
        heroi.atingido(); //11
        heroi.atingido(); //10
        heroi.atingido(); //9
        heroi.atingido(); //8
        heroi.atingido(); //7
        heroi.atingido(); //6
        heroi.atingido(); //5
        heroi.atingido(); //4
        heroi.atingido(); //3
        heroi.atingido(); //2
        heroi.atingido(); //1
        heroi.atingido(); //0
        heroi.atingido(); //0
        
        System.out.println(heroi.getVida());
        System.out.println(heroi.getVivo());
        
        heroi.princesa();//0
        
        System.out.println(heroi.getVida());
        System.out.println(heroi.getVivo());
    }

}
