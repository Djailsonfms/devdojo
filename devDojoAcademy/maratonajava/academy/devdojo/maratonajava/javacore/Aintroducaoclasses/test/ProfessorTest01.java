package maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String args[]) {
        Professor professor = new Professor();

        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.sex = 'M';

        System.out.println("Nome: "+professor.name+", Idade: "+professor.age+", Sexo: "+professor.sex);
    }
}
