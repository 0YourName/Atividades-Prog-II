package yn.robo;

public class Main {

    public static void main(String[] args) {
        Robo[] robo = new Robo[3];

        robo[0] = new RoboMarciano();
        robo[1] = new RoboSolar();
        robo[2] = new RoboPlutoniano();

        for (Robo r : robo) {
            System.out.println(r.mostrarPosicao());
            System.out.println(r.toString());
        }
    }
}
