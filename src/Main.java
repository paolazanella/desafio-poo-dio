import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8, "curso java", "descrição curso java");

        Curso curso2 = new Curso(4, "curso js", "descrição curso js");

        Mentoria mentoria = new Mentoria(LocalDate.now(), "mentoria de java", "descrição mentoria java");

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Paola");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Kauan:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paola:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paola:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev("Melissa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Melissa:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Melissa:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Melissa:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }

}