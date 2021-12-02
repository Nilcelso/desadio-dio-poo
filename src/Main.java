import br.com.nilcelso.poo.Bootcamp;
import br.com.nilcelso.poo.Curso;
import br.com.nilcelso.poo.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNil = new Dev();
        devNil.setNome("Nilcelso");
        devNil.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nilcelso" + devNil.getConteudosInscritos());
        devNil.progredir();
        System.out.println("Conteudos Inscritos Nilcelso" + devNil.getConteudosInscritos());
        devNil.progredir();
        System.out.println("Conteudos Inscritos Nilcelso" + devNil.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nilcelso" + devNil.getConteudosConcluidos());
        System.out.println("XP Nilcelso: " + devNil.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos conlcuidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());





    }
}
