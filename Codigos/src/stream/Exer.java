package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exer {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante(20, "Bryan"));
        estudantes.add(new Estudante(27, "Catharine"));
        estudantes.add(new Estudante(58, "Johnny"));
        estudantes.add(new Estudante(56, "Rosa"));
        estudantes.add(new Estudante(19, "Kozo"));
        estudantes.add(new Estudante(19, "Malluza"));
        estudantes.add(new Estudante(20, "Guilherme"));
        estudantes.add(new Estudante(5, "GABRIEL"));

        System.out.println("------------------ EXER A ------------------");
        System.out.println(estudantes.stream()
            .map((estudante -> estudante.getNome() + " - " + estudante.getIdade()))
            .collect(Collectors.toList()));

        System.out.println("------------------ EXER B ------------------");
        System.out.println("Números de estudantes: " + estudantes.stream().count());

        System.out.println("------------------ EXER C ------------------");
        List<Estudante> aux = estudantes.stream()
                .filter( (estudante) -> estudante.getIdade() >= 18 )
                .collect(Collectors.toList());
        System.out.println("Estudantes com mais de 18: " + aux);

        System.out.println("------------------ EXER D ------------------");
        estudantes.stream().forEach(System.out::println);

        System.out.println("------------------ EXER E ------------------");
        aux = estudantes.stream()
                .filter(estudante -> estudante.getNome().toLowerCase().contains("b"))
                .collect(Collectors.toList())
        ;
        System.out.println("Estudantes com 'b' no nome: " + aux);

        System.out.println("------------------ EXER F ------------------");
        System.out.println("Existe alguém com 'D' no nome? " + estudantes.stream()
            .anyMatch(estudante -> estudante.getNome().toLowerCase().contains("D"))
        );

        System.out.println("------------------ EXER G ------------------");
        System.out.println("Aluno mais velho " + estudantes.stream()
                .max(Comparator.comparingInt(Estudante::getIdade))
        );
        System.out.println("Aluno mais velho " + estudantes.stream()
                .min(Comparator.comparingInt(Estudante::getIdade))
        );



    }

}
