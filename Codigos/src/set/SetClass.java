package set;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {

        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(5.3);
        notaAlunos.add(8.7);
        notaAlunos.add(9.4);
        notaAlunos.add(1.2);
        notaAlunos.add(3.7);
        notaAlunos.add(5.78);

        System.out.println(notaAlunos); //não manteve a ordem de inserção

    }

}
