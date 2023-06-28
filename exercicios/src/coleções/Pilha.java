package cole��es;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    //LIFO (Last In First Out) = o �ltimo a entrar � o primeiro a sair.

    public static void main (String[] args){

        Deque <String> livros = new ArrayDeque <String>();

        livros.add("Sherlock Holmes");
        livros.push("Solo Leveling");
        livros.push("Filhos de �den");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for(String livro: livros){
            System.out.println(livro);
        }
        
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.pop()); Retorna Exception quando pilha vazia;
        //System.out.println(livros.remove());
        
        //A diferen�a do forEach e do .pop ou.poll �:
        //forEach somente l� na ordem, por�m n�o remove da pilha
        //os demais l�em e removem

        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();
    }
}

