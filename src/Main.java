import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Double> conta = new ArrayList<>();
        //List<Double> conta = new ArrayList<Double>() ;
       // List<Double> conta = new ArrayList<>(Arrays.asList(7d, 8.5,7.5, 5d, 0d, 3.6));
        //conta.add(9.0);
        System.out.println("Crie uma lista e adcione as sete notas");
        List<Double> notas = new ArrayList<Double>() ;
        notas.add(7d);
        notas.add(8.5d);
        notas.add(3.4d);
        notas.add(2.8d);
        notas.add(1d);
        notas.add(0d);
        notas.add(9.6d);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Informa o valor e ele mostra a posição " + notas.indexOf(7d));
        System.out.println("Adciona na posição e o valor");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substitua o valor ");
        notas.set(notas.indexOf(1d), 7.2);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 7.2 está na Lista "+ notas.contains(7.2));
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a quinta nota adicionada: " + notas.get(4));
        notas.set(notas.indexOf(0d), 7.0);
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));





        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        System.out.println("Aaqui vai passar numero por numero até não ter next e ir pra false");
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;

        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Exiba a media dos valores: "+ soma/notas.size());

        System.out.println("Remova a nota 0 (posição)");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova a nota 8.5 (valor)");
        notas.remove(8.5);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
           if(iterator1.next()<7)iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("confira se a lista ta vazia " + notas.isEmpty());

    }

}