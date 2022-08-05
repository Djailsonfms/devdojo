package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais03{
    public static void main(String[] args){
        // age < 15 children's category
        // age >= 15 && < 18 juvenile category
        // age >= 18 adult category
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite su idade:");
            int age = sc.nextInt();
            String category;
            //String category = ""; Inicializando a variavel
            if(age < 15){
                category = "Children category";
            }else if( age >= 15 &&  age < 18 ){
                category = "Juvenile category";
            }else{
               category = "Adult category";
            }
            System.out.println(category);
        }
    }
}