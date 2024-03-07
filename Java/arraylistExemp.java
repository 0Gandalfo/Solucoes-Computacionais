import java.util.ArrayList;
import java.util.Collections;

public class arraylistExemp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList<String>();
        System.out.println("Lista(" + Lista.size() + "): " + Lista);

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        System.out.println("Lista(" + lista.size() + "): " + Lista);

        Collections.shuffle(Lista);
        System.out.println("Lista(" + lista.size() + "): " + lista);
        Collections.sort(lista);
        System.out.println("Lista(" + lista.size() + "): " + lista);
        Collections.reverse(Lista);
        System.out.println("Lista(" + lista.size() + "): " + lista);

        System.out.println("Minimo: " + Collections.min(lista));
        System.out.println("Maximo: " + Collections.max(lista));


        lista.remove("C");
        System.out.println("Lista(" + lista.size() + "): " + lista);

        lista.remove(1);
        System.out.println("Lista(" + lista.size() + "): " + lista);
         
        lista.clear();
        System.out.println("Lista(" + lista.size() + "): " + lista);

        ArrayList<Integer> listaInteiro = new ArrayList<Integer>();
        System.out.println("ListaInteiro(" + listaInteiro.size() + "): " + listaInteiro);

        listaInteiro.add(10);
        listaInteiro.add(1);
        listaInteiro.add(2);
        listaInteiro.add(20);
        listaInteiro.add(30);
        listaInteiro.add(40);
        listaInteiro.add(30);
        listaInteiro.add(30);
        listaInteiro.add(30);
        listaInteiro.add(30);
        listaInteiro.add(30);
        System.out.println("ListaInteiro(" + listaInteiro.size() + "): " + listaInteiro);

        listaInteiro.remove(1);
        System.out.println("ListaInteiro(" + listaInteiro.size() + "): " + listaInteiro);

        listaInteiro.remove(listaInteiro.indexOf(30));
        System.out.println("ListaInteiro(" + listaInteiro.size() + "): " + listaInteiro);

        int i = 0:
        do {
            i = listaInteiro.indexOf(30);
            if (i >= 0) {
                listaInteiro.remove(i);
                
            }
            System.out.println("ListaInteiro(" + listaInteiro.size() +"): " + listaInteiro);



        }






    }

}
