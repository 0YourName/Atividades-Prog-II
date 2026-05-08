package yn.caixadesom;

public class CaixaDeSom {

    boolean ligada;
    int volume;

    CaixaDeSom() {
        ligada = false;
        volume = 0;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
        volume = 0;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if ((ligada) && (volume > 0)) {
            volume--;
        }
    }

}
