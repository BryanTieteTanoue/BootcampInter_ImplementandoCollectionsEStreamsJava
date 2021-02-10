package map;

import java.util.HashMap;
import java.util.Map;

public class Exer {

    public static void main(String[] args) {

        Map<String, String> estados = new HashMap<>();

        System.out.println("------------- EXER 1 -------------");
        estados.put("AC" ,"Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santp");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        estados.get(3);

        System.out.println("------------- EXER 2 -------------");
        estados.remove("MG");

        System.out.println("------------- EXER 3 -------------");
        estados.put("DF", "Distrito Federal");

        System.out.println("------------- EXER 4 -------------");
        int tamanho = estados.size();
        System.out.println("O tamanho é: " + tamanho);

        System.out.println("------------- EXER 5 -------------");
        for(Map.Entry<String, String> entry: estados.entrySet()){
            if (entry.getValue().equals("Minas Gerais")) {
                estados.remove(entry.getKey());
            }
        }

        System.out.println("------------- EXER 6 -------------");
        for(Map.Entry<String, String> entry : estados.entrySet()){
            System.out.println(entry.getValue().toUpperCase()
                    + "(" + entry.getKey() + ")");
        }

        System.out.println("------------- EXER 7 -------------");
        boolean exists = estados.containsKey("SC");
        System.out.println("SC está no map?"  + exists);

        System.out.println("------------- EXER 8 -------------");
        exists = estados.containsValue("Maranhão");
        System.out.println("Maranhão está no map?"  + exists);






    }

}
