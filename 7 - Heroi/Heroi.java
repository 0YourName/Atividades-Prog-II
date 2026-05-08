package yn.ex160426;

public class Heroi {

    private String nome;
    private Integer vida;
    private boolean vivo;

    public Heroi() {
        nome = "";
        vida = 10;
        vivo = true;
    }

    public int getVida() {
        if (vida <= 0) {
            vivo = false;
        }
        return vida;
    }
    
    public boolean getVivo(){
        return vivo;
    }

    public void atingido() {
        if (vida > 0) {
            vida -= 1;
            if (vida <= 0) {
                vivo = false;
            }
        }
    }

    public void princesa() {
        if (vida > 0) {
            vida += 5;
        }
    }
}
