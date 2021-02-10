package set;

import java.util.*;

public class Exer {

    public static void main(String[] args) {
        Set<Integer> intHashSet = new HashSet<>();
        Set<Integer> intLinked = new LinkedHashSet<>();
        Set<Integer> intTree = new TreeSet<>();

        System.out.println("--------- Exer 1 ---------");
        for (int i = 0; i < 5; i++){
            intHashSet.add(i * i);
            intLinked.add(i * i);
            intTree.add(i * i);
        }

        System.out.println("--------- Exer 2 ---------");
        System.out.println("HashSet");
        for(Integer num : intHashSet){
            System.out.println("-> " + num);
        }

        System.out.println("intLinked");
        for(Integer num : intLinked){
            System.out.println("-> " + num);
        }

        System.out.println("intTree");
        for(Integer num : intTree){
            System.out.println("-> " + num);
        }

        System.out.println("--------- Exer 3 ---------");
        System.out.println("HashSet");
        intHashSet.remove(0);
        System.out.println(intHashSet);

        System.out.println("intLinked");
        intLinked.remove(0);
        System.out.println(intLinked);

        System.out.println("intTree");
        intTree.remove(0);
        System.out.println(intTree);

        System.out.println("--------- Exer 4 ---------");
        intHashSet.add(23);
        intLinked.add(23);
        intTree.add(23);

        System.out.println("--------- Exer 5 ---------");
        System.out.println(" tamanho intTree: " + intHashSet.size());
        System.out.println(" tamanho intLinked: " + intLinked.size());
        System.out.println(" tamanho intTree: " + intTree.size());

        System.out.println("--------- Exer 6 ---------");
        System.out.println("intHashSet está vazio? " + intHashSet.isEmpty());
        System.out.println("intLinked está vazio? " + intLinked.isEmpty());
        System.out.println("intTree está vazio? " + intTree.isEmpty());


    }
}
