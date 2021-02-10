package Comparators;

import java.util.Comparator;

public class ClasseDeComparacao implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getAno() - c2.getAno();
    }

}
