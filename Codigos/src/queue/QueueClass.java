package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        System.out.println("------------------------------");
        String clienteAserAtendido = filaBanco.poll(); //retira o primeiro elmento
        System.out.println(clienteAserAtendido);
        System.out.println(filaBanco);

        System.out.println("------------------------------");
        String primeirCliente = filaBanco.peek();   //apenas mostra o primeiro da fila
        System.out.println(primeirCliente);
        System.out.println(filaBanco);

        System.out.println("------------------------------");
        //filaBanco.clear();                                //usar para verificar o ".element()"
        String primeiroClienteOuErro = filaBanco.element(); //mostra o elemento (como ".peek()"), mas se estiver vazio ocorrerá uma exception
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        System.out.println("------------------------------");
        for(String element : filaBanco){
            System.out.println("-->" + element);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println("*** " + iteratorFilaBanco.next() + " ***");
        }

        System.out.println("------------------------------");

    }

}
