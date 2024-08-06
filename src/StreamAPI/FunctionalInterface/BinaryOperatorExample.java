package StreamAPI.FunctionalInterface;

/*
Representa uma operacao que combina dois argumentos tipo T
e retorna um resultado do mesmo tipo.
Usada em operacoes de reducao em pares de elementos, como
somar numeros ou combinar objetos
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 105);

        //usar o BinaryOperator com expressao lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1+num2;

        //usar BinaryOperator para somar todos os numeros no Stream
        //     reduce e uma bariavel temporaria, 0 += soma(que e a binary operatos);
        //int resultado = numeros.stream().reduce(0, somar);

        //ou se for SUPRIMIR o BinaryOperator        ou ( n1,  n2) -> n1 + n2 ou
        int resultado = numeros.stream().reduce(0, Integer::sum);


        // Imprimir o resultado da soma
        System.out.println(" A soma dos numeros e: " + resultado);

    }
}
