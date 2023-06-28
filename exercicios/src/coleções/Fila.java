package cole��es;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList <>();

        //Tanto o .add(), quanto o .offer() adicionam elementos na fila
        //A diferen�a � o comportamento quando a fila est� cheia
        fila.add("Ana"); // Gera um erro Exception
        fila.offer("Bia"); // Retorna a adi��o como false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafael");
        fila.offer("Gui");

        //Tanto o .peek(), quanto o .element() obtem o pr�ximo elemento da fila
        //sem remover
        //a diferen�a � o comportamento quando a fila est� vazia.
        System.out.println(fila.peek()); // Retorna o valor como null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Gera um erro Exception
        System.out.println(fila.element());

        //.poll(); e .remove() -> obtem o pr�ximo elemento da fila(remove o elemento)
        
        //A diferen�a do comportamento � quando a fila est� vazia
        System.out.println(fila.poll()); //Retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        //System.out.println(fila.remove()); // Retorna Exception

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
    }
}

