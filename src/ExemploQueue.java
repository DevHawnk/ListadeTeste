import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class ExemploQueue {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Cesa");
        filaBanco.add("Cristhofe");
        filaBanco.add("Paloma");
        filaBanco.add("Arnaldo");

        System.out.println(filaBanco);

        String clienteASerAtendida = filaBanco.poll();

        System.out.println(clienteASerAtendida);

        System.out.println(filaBanco);



        //filaBanco.clear();
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);



        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);


        for (String cliente: filaBanco){
            System.out.println("-" + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("--->" + iteratorFilaBanco.next());


        }

    }

}
