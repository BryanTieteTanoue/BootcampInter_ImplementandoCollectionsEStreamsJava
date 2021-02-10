package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exer {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        System.out.println("------ Exer 1 ------");

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println("------ Exer 2 ------");
        for (String nome: fila) {
            System.out.println("-->" + nome);
        }

        System.out.println("------ Exer 3 ------");
        String primeiro = fila.peek();
        System.out.println(primeiro);
        System.out.println(fila);

        System.out.println("------ Exer 4 ------");
        primeiro = fila.poll();
        System.out.println(primeiro);
        System.out.println(fila);

        System.out.println("------ Exer 5 ------");
        fila.add("Daniel");
        System.out.println(fila);

        System.out.println("------ Exer 6 ------");
        int tamanho = fila.size();
        System.out.println("A fila tem tamanho " + tamanho);

        System.out.println("------ Exer 7 ------");
        boolean vazia = fila.isEmpty();
        System.out.println("A fial está vazia? " + vazia);

        System.out.println("------ Exer 8 ------");
        boolean carlos = fila.contains("Carlos");
        System.out.println("Há um Carlos na fila?" + carlos);
    }

}
