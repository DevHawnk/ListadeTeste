import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tenis de Mesa");
        esportes.add("Futebol Americano");
        esportes.add("Beisiball");

        esportes.set(2, "Ping Pong");

        esportes.remove("Futebol");

        System.out.println(esportes.get(0));

        for (String esporte: esportes) {

            System.out.println(esportes);

        }
    }
}