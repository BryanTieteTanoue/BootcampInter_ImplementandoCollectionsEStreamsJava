package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        Set<String> treeCapitais = new TreeSet<>();

        //o treeSet monta uma árvore, ou seja, a ordem vai estar diferente
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curtiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);
        System.out.println(((TreeSet<String>) treeCapitais).lower("PortoAlegre"));


    }

}
