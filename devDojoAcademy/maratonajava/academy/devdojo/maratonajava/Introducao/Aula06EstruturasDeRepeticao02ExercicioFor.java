package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao02ExercicioFor{
    public static void main(String[] args){
        // Print all even number from 0 to 1.000.000
        
        for(int i = 0;i < 1000000; i ++){
            if(i % 2 ==0){
                System.out.println("number pairs  "+i);
            }
            
        }
    }
}