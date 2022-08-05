package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        //While, do while, for
        int count = 0;
        
        while(count < 10){// enquanto
            System.out.println(count);
            count = count + 1;
        }
        int contar = 0;
        do{                     //Faça
            System.out.println(contar++);
        } while(contar < 15 );  // Enquanto

        for(int i = 0; i < 100; i++){// Para i começando de 0, até o i ser menor do que 10 
                                    // incremente + 1
            System.out.println("For "+i);                     

        }
    }
}
