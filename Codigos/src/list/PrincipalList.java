package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class PrincipalList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");    //adiciona itens a lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        Collections.sort(nomes);    //ordena a lista
        System.out.println(nomes);

        nomes.set(3, "Larissa"); //muda o valor do elemento na posição indicada
        System.out.println(nomes);

        nomes.remove(4);    //remove o elemento na posição 2
        System.out.println(nomes);
        nomes.remove("João");   //remove um elemento baseado no valor do elemento
        System.out.println(nomes);

        var nome = nomes.get(3);    ///retorna o valor na posição indicada
        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos");  //retorna o indece do valor indicado, caso não exista retorna -1
        System.out.println(posicao);

        var contem = nome.contains("Anderson"); //verifica se existe um elemento com o valor indicado
        System.out.println(contem);

        var vazio = nome.isEmpty();  //verifica se a lista está vazia
        System.out.println(vazio);

        for(String nomeDoItem : nomes){     //percorre a lista
            System.out.println(nomeDoItem);
        }

        System.out.println("");
        Iterator<String> iterator = nomes.iterator();   //outra forma de percorrer a lista
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        nomes.clear();  //limpa a lista
        vazio = nomes.isEmpty();
        System.out.println(vazio);
        
    }

}
