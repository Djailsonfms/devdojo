package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao03Break {
    // Print the first 25 numbers of a given value for example 50
    public static void main(String[] args){
        int valueMax = 50;
        for(int i = 0; i < valueMax; i++){
            if( i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
