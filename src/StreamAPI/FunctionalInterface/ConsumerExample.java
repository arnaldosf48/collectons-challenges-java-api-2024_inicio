package StreamAPI.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
ela representa um argumento tipo T(qualuqer tipo) {Conseumer<T>} ela nao retorna nada e
e utiliziada PRINCIPALMENTE para realizar acoes, ou efeitos colaterais nos elementos
do Stream sem modificar ou retornar valor
 */
public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o Consumer com exmpressao lambda para imprimir numeros pares

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }

        };

        //usar o consumer para imprimir
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });
        /* OU PODE SER DESSA FORMA MAIS RESUMIDA ABAIXO:

        numeros.stream().forEach( n -> { // ou apenas numeros.forEach(...)
                if (n % 2 == 0) {
                    System.out.println(n);
                }
                }
            );
         */
        //forma top de fazer aqui oh
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);


    }
}
