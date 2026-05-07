package yn.lampada;

public class Lampada {
    boolean acesa;
    
    public Lampada(){
        acesa = false;
    }
    
    public void acender(){
        acesa = true;
    }
    
    public void apagar(){
        acesa = false;
    }
    
    public void estado(){
        System.out.println(acesa);
    }
}
