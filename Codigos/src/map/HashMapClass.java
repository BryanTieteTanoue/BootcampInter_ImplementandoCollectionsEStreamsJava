package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {
        Map<String, Integer> campeaoFifa = new HashMap<>();

        //Adiciona elementos ao map
        campeaoFifa.put("Brasil", 5);
        campeaoFifa.put("Alemanha", 4);
        campeaoFifa.put("Itália", 4);
        campeaoFifa.put("Uruguai", 3);
        campeaoFifa.put("Argentina", 2);
        campeaoFifa.put("França", 2);
        campeaoFifa.put("Inglaterra", 1);
        campeaoFifa.put("Espanha", 1);
        System.out.println(campeaoFifa);

        campeaoFifa.put("Brasil", 6);   //irá atulaizar o map, pois a chave "Brasil" já existe
        System.out.println(campeaoFifa);

        //retorna o valor da chave "Argentina"
        System.out.println(campeaoFifa.get("Argentina"));

        //Verifiaca se uma chave existe
        System.out.println(campeaoFifa.containsKey("França"));

        //Remove um elemento
        campeaoFifa.remove("França");
        System.out.println(campeaoFifa.containsKey("França"));

        //Verifica se um valor existe
        System.out.println(campeaoFifa.containsValue(6));

        //Verifica o tamanho do mapa
        System.out.println(campeaoFifa.size());

        //navega no mapa
        for(Map.Entry<String, Integer> entry : campeaoFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for(String key : campeaoFifa.keySet()){ //um pouco menos perfomático
            System.out.println(key + " -- " + campeaoFifa.get(key));
        }


    }

}
