package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula07Arrays03{
    public static void main(String[]args){
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5,6};
        int[] numbers3 = new int []{1,5,9,3,7,8,4,2,6};

        for(int i = 0; i < numbers.length; i ++){
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");

        for(int j = 0; j < numbers2.length; j ++){
            System.out.println(numbers2[j]);
        }

        System.out.println("-----------------------------");

        for(int k = 0; k < numbers3.length; k ++){
            System.out.println(numbers3[k]);
        }

        System.out.println("-----------------------------");
        
        for(int l:numbers2){
            System.out.println(l);
        }
    }
}