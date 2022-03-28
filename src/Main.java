import br.com.fjz.desafio.dominio.Bootcamp;
import br.com.fjz.desafio.dominio.Curso;
import br.com.fjz.desafio.dominio.Dev;
import br.com.fjz.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java");
        bootcamp.setDescricao("Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev z = new Dev();
        z.setNome("FJZ");
        z.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos FJZ:" + z.getConteudosInscritos());
        z.progredir();
        z.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos FJZ:" + z.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos FJZ:" + z.getConteudosConcluidos());
        System.out.println("XP:" + z.calcularTotalXP());

        System.out.println("-------");

        Dev m = new Dev();
        m.setNome("Mario");
        m.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mario:" + m.getConteudosInscritos());
        m.progredir();
        m.progredir();
        m.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mario:" + m.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mario:" + m.getConteudosConcluidos());
        System.out.println("XP:" + m.calcularTotalXP());
    }
}
