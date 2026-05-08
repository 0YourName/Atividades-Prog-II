package yn.ponto;

public class Pixel extends Ponto{
    String cor;
    
    public Pixel(){
        super();
        cor = "preto";
    }
    
    public Pixel(Integer x, Integer y){
        super(x, y);
        cor = "preto";
    }
    
    public Pixel(Integer x, Integer y, String cor){
        super(x, y);
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    @Override
    public String printar(){
        return "Sou um ponto na posição [" + getX() + "," + getY() + "] e tenho a cor " + cor;
    }
}
