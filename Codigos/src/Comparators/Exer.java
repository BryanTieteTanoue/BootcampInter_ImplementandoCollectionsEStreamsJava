package Comparators;

import java.util.*;

public class Exer {

    public static void main(String[] args) {

        List<Carro> lista = new ArrayList<Carro>();
        Carro c1 = new Carro(1990, "Gol", "volks");
        Carro c2 = new Carro(2013, "Celta", "Reanult");
        Carro c3 = new Carro(2015, "Camaro", "Chevolet");
        Carro c4 = new Carro(2012, "Versa", "Nissan");
        Carro c5 = new Carro(1999, "Uno", "Ford");

        System.out.println("-------------- Exer 1 --------------");
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        System.out.println(lista);

        System.out.println("-------------- Exer 2 --------------");
        lista.sort(Comparator.comparingInt(Carro::getAno));
        System.out.println(lista);

        System.out.println("-------------- Exer 3 --------------");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("-------------- Exer 4 --------------");
        lista.sort((carro1, carro2) -> carro1.getAno() - carro2.getAno());
        System.out.println(lista);




    }
}