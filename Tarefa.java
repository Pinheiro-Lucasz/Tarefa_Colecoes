package Grupos;

import java.util.Map;
import java.util.TreeMap;

public class Tarefa {

    public static void main(String args[]){
        Map<String, String> lista = new TreeMap<>();
        lista.put("Don Vito",  "Masculino");
        lista.put("Maria Macadão", "Femino");
        lista.put("Don Barzino", "Masculino");
        lista.put("Sinhazinha", "Feminino");

        System.out.println("Impressao");
        lista.forEach((key, value) -> System.out.println(key + " " + value));


    }
}
