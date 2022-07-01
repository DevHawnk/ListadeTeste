import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Alano");
        nomes.add("Mario");
        nomes.add("Kelly");
        nomes.add("Camila");
        nomes.add("Shaianne");
        nomes.add("Paulo Germano");
        nomes.add("Marilia");
        nomes.add("Silva");
        nomes.add("Ramiro");
        nomes.add("Mario");

        System.out.println(nomes);

        nomes.set(5, "Paulo Rocha");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.remove(9);

        System.out.println(nomes);

        int posicao = nomes.indexOf("Alano");

        System.out.println(posicao);

        nomes.remove("Alano");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nomes);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temWesley = nomes.contains("Wesley");

        System.out.println(temWesley);
        boolean temKelly = nomes.contains("Kelly");

        System.out.println(temKelly);

        for (String nomeDoItem: nomes){

            System.out.println("--->" + nomeDoItem);

        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("____>" + iterator.next());

        }
    }
}