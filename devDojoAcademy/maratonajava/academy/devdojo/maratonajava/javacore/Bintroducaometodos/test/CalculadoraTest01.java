package maratonajava.academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("----------------");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
