package maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Sanji";
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

        System.out.println("------------------");

        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.sex);
    }
}
