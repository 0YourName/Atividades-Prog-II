package yn.ex160426;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuplaTest {

    public DuplaTest() {
    }

    @org.junit.jupiter.api.Test
    public void testDupla() {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Maria");
        aluno1.setMatricula(12);

        aluno2.setNome("José");
        aluno2.setMatricula(34);

        Dupla dupla = new Dupla();

        dupla.setAluno1(aluno1);
        dupla.setAluno2(aluno2);

        Aluno sorteado = dupla.sortear();

        System.out.println(sorteado.getNome() + " " + sorteado.getMatricula());
    }

}
