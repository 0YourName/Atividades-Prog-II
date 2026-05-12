package yn.robo;

public class Main {

    public static void main(String[] args) {
        Robo[] robo = new Robo[3];

        robo[0] = new RoboMarciano(1, "Marco", 2, 5);
        robo[1] = new RoboSolar(2, "Solange", 5, 7, true);
        robo[2] = new RoboPlutoniano(3, "Platão", 8, 19, 5);

        for (Robo r : robo) {
            System.out.println(r.getNome() + " - " + r.mostrarPosicao());
            System.out.println(r + "\n");
        }
    }
}
