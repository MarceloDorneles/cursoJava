package coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    //LIFO (Last In First Out) = o último a entrar é o primeiro a sair.

    public static void main (String[] args){

        Deque <String> livros = new ArrayDeque <String>();

        livros.add("Sherlock Holmes");
        livros.push("Solo Leveling");
        livros.push("Filhos de Éden");

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
        
        //A diferença do forEach e do .pop ou.poll é:
        //forEach somente lê na ordem, porém não remove da pilha
        //os demais lêem e removem

        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();
    }
}

