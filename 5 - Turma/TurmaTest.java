package yn.ex160426;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    
    public TurmaTest() {
    }

    @Test
    public void testTurma() {
        Turma turma = new Turma();
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        
        aluno1.setNome("Maria");
        turma.getAlunos()[0] = aluno1;
        
        aluno2.setNome("Luiz");
        turma.getAlunos()[1] = aluno2;
        
        aluno3.setNome("Clara");
        turma.getAlunos()[2] = aluno3;
        
        aluno4.setNome("Meredith");
        turma.getAlunos()[3] = aluno4;
        
        aluno5.setNome("Yuri");
        turma.getAlunos()[4] = aluno5;
        
        for(int i = 0; i < 5; i++){
            System.out.println(turma.getAlunos()[i].getNome());
        }
    }
    
}
