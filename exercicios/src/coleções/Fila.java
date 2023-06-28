package coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList <>();

        //Tanto o .add(), quanto o .offer() adicionam elementos na fila
        //A diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); // Gera um erro Exception
        fila.offer("Bia"); // Retorna a adição como false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafael");
        fila.offer("Gui");

        //Tanto o .peek(), quanto o .element() obtem o próximo elemento da fila
        //sem remover
        //a diferença é o comportamento quando a fila está vazia.
        System.out.println(fila.peek()); // Retorna o valor como null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Gera um erro Exception
        System.out.println(fila.element());

        //.poll(); e .remove() -> obtem o próximo elemento da fila(remove o elemento)
        
        //A diferença do comportamento é quando a fila está vazia
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

