package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais07SwitchExercicio {
    public static void main(String[] args){
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número entre 1 e 7");
            byte day = sc.nextByte();
            switch(day){
                case 1:
                    System.out.println("Final de semana");
                    break;
                case 2:
                    System.out.println("Dia util");
                    break;
                case 3:
                    System.out.println("Dia util");
                    break;
                case 4:
                    System.out.println("Dia util");
                    break;
                case 5:
                    System.out.println("Dia util");
                    break;
                case 6:
                    System.out.println("Dia util");
                    break;
                case 7:
                    System.out.println("Final de semana");
                    break;
                default:
                    System.out.println("Digite um número entre um 1 e 7");
                
            }
        }
    }
}