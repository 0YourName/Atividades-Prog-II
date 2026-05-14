package yn.veiculo;

public class Main {
    public static void main(String[] args) {
        Caminhao cam1 = new Caminhao("Volvo", 1998, 120000, 2000);
        Caminhao cam2 = new Caminhao("Volvo", 2007, 150000, 2500);
        
        System.out.println(cam1.calcularIPVA());
        System.out.println(cam2.calcularIPVA());
        
        Carro car1 = new Carro("Ford", 2012, 50000, 8);
        Carro car2 = new Carro("Fiat", 1992, 20000, 2);
        System.out.println();
        System.out.println(car1.calcularIPVA() + " " + car1.getPortas());
        System.out.println(car2.calcularIPVA() + " " + car2.getPortas());
        
    }
}
