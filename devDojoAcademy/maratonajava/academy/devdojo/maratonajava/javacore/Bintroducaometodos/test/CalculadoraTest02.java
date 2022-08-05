package maratonajava.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import maratonajava.academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        calculadora.multiplicaDoisNumeros(input.nextInt(), input.nextInt());
    }
}
