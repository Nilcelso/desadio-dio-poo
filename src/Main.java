import br.com.nilcelso.poo.Curso;
import br.com.nilcelso.poo.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso");
        curso1.setCargahoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Kotlin");
        curso2.setDescricao("descrição do curso");
        curso2.setCargahoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("descricao da mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
