package cartao;

import org.junit.jupiter.api.Test;

public class CartaoTest {

    public CartaoTest() {
    }

    @Test
    public void testCartao() {
        Cartao cartao = new Cartao();

        System.out.println(cartao.getSaldo());//saldo inicial 10

        cartao.pedirCafe();//9
        cartao.pedirCafe();//8
        cartao.pedirCafe();//7
        cartao.pedirCafe();//6
        cartao.pedirCafe();//5
        cartao.pedirCafe();//4
        cartao.pedirCafe();//3
        cartao.pedirCafe();//2
        cartao.pedirCafe();//1
        cartao.pedirCafe();//0
        cartao.pedirCafe();//0
        cartao.pedirCafe();//0

        System.out.println(cartao.getSaldo());

        cartao.recarregarCartao(20);//saldo + quantidade desejada

        System.out.println(cartao.getSaldo());
    }

}
