package maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String args[]) {
        Car carro1 = new Car();
        Car carro2 = new Car();

        carro1.name = "Fusca";
        carro1.model = "Sport";
        carro1.year = 1969;

        carro2.name = "Mustang";
        carro2.model = "Gt";
        carro2.year = 1971;

        System.out.println("Nome:" + carro1.name + ", Modelo:" + carro1.model + ", Ano:" + carro1.year);
        System.out.println("Nome:" + carro2.name + ", Modelo:" + carro2.model + ", Ano:" + carro2.year);

    }
}
