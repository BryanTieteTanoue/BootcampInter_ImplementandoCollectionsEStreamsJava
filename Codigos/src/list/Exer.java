package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exer {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String nome : nomes){
            System.out.println("--> " + nome);
        }

        nomes.set(nomes.indexOf("Carlos"), "Roberto");  //usar o "indexOf" evita ter que saber o index
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        int qtd = nomes.size();
        System.out.println(qtd);

        boolean julianaExits = nomes.contains("Juliana");
        System.out.println(julianaExits);

        List<String> outrosNomes = new ArrayList<>();
        outrosNomes.add("Ismael");
        outrosNomes.add("Rodrigo");
        nomes.addAll(outrosNomes);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        boolean empty = nomes.isEmpty();
        System.out.println(empty);

    }

}
