package yn.ex160426;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno() {
        nome = "";
        matricula = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
