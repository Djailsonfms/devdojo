package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais06Switch {
    public static void main(String[] args){
        // Print the day of the week,considering 1 as sunday

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número de 1 a 7");
            byte day = sc.nextByte();

            // char, int, byte, short, enum, String, boolean
            switch (day){
                case 1:
                    System.out.println("Domingo"); 
                    break;

                case 2: 
                    System.out.println("Segunda");
                    break;

                case 3:
                    System.out.println("Terça");
                    break;
                
                case 4:
                    System.out.println("Quarta");
                    break;

                case 5:
                    System.out.println("Quinta");
                    break;

                case 6:
                    System.out.println("Sexta");
                    break;

                case 7:
                    System.out.println("Sábado");
                    break;
                
                default:
                    System.out.println("Número invalido. Digite um número entre 1 e 7");

        }
            char sexo = 'M';
            switch(sexo){
                case 'M':
                    System.out.println("Homem");
                    break;
                
                case 'F' :
                    System.out.println("Mulher");
                    break;

                default:
                    System.out.println("Invalido");
            }

        }
    }
}
