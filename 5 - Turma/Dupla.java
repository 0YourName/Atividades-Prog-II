package yn.ex160426;

import java.util.concurrent.ThreadLocalRandom;

public class Dupla {

    private Aluno aluno1;
    private Aluno aluno2;

    public void setAluno1(Aluno aluno){
        this.aluno1 = aluno;
    }
    
    public void setAluno2(Aluno aluno){
        this.aluno2 = aluno;
    }

    public Aluno sortear() {
        int numero = ThreadLocalRandom.current().nextInt(1, 3);
        if (numero == 1) {
            return aluno1;
        } else {
            return aluno2;
        }
    }
}
