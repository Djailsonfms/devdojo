package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais02{
    public static void main(String[] args){
        // age < 15 children's category
        // age >= 15 && < 18 juvenile category
        // age >= 18 adult category
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite su idade:");
            int age = sc.nextInt();
            if(age < 15){
                System.out.println("Children category");
            }else if( age >= 15 &&  age < 18 ){
                System.out.println("Juvenile category");
            }else{
                System.out.println("Adult category");
            }
        }
    }
}