package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

    public static void main(String[] args) {
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(32);

        System.out.println(sequenciaNumerica);  //mantém a ordem
    }

}
