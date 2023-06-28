package cole��es;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado
{
    public static void main(String[] args) {

//        Set<String> listaAprovados = new HashSet<>();
        //Como foi o Set foi configurado com <String>, ele n�o ir�
        //aceitar outro objeto, fora Strings.

        SortedSet<String> listaAprovados = new TreeSet<>();
        //O c�digo TreeSet respeita a ordem de inser��o dos candidatos.
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        } 

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums){
            System.out.println(n);
        }
    }
}
