package Optioal;

import java.util.Optional;

public class Exer {

    public static void main(String[] args) {

        System.out.println("--------------- Exer 1 ---------------");
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalPresent = Optional.of("Tem algo dentro");
        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("--------------- Exer 2 ---------------");
        if(optionalEmpty.isPresent()){
            System.out.println(optionalEmpty);
        }
        if(optionalPresent.isPresent()){
            System.out.println(optionalPresent);
        }
        if(optionalNull.isPresent()){
            System.out.println(optionalNull);
        }

        System.out.println("--------------- Exer 3 ---------------");
        /*if(!optionalEmpty.isPresent()){    //dá erro como o exercício quer, mas impede o código de seguir
            throw new IllegalStateException();
        }
        if(!optionalPresent.isPresent()){
            throw new IllegalStateException();
        }
        if(!optionalNull.isPresent()){
            throw new IllegalStateException();
        }*/

        System.out.println("--------------- Exer 4 ---------------");
        if(!optionalEmpty.isPresent()){
            System.out.println("Optional vazia");
        }
        if(!optionalPresent.isPresent()){
            System.out.println("Optional vazia");
        }
        if(!optionalNull.isPresent()){
            System.out.println("Optional vazia");
        }

        System.out.println("--------------- Exer 5 ---------------");
        if(optionalEmpty.isPresent()){
            optionalEmpty = Optional.of("optionalEmpty está presente");
            System.out.println(optionalEmpty);
        }
        if(optionalPresent.isPresent()){
            optionalPresent = Optional.of("optionalPresent está presente");
            System.out.println(optionalPresent);
        }
        if(optionalNull.isPresent()){
            optionalNull = Optional.of("optionalNull está presente");
            System.out.println(optionalNull);
        }

        System.out.println("--------------- Exer 6 ---------------");
        String s = optionalPresent.get();
        System.out.println(s);


    }


}
