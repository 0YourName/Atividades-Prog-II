package cartao;

public class Cartao {

    private int saldo;

    public Cartao() {
        saldo = 10;
    }

    public int getSaldo() {
        return saldo;
    }

    public void pedirCafe() {
        if (saldo > 0) {
            saldo--;
        }
    }

    public void recarregarCartao(int quantidade) {
        saldo += quantidade;
    }
}
