package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula07Arrays01 {
    public static void main(String[] args){
        int [] age = new int[5];
        age[0] = 5;
        age[1] = 10;
        age[2] = 21;
        age[3] = 8;
        age[4] = 23;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);


        System.out.println("##################");

        for(int i = 0; i < age.length; i ++){
            //System.out.println(i);
            System.out.println(age[i]);
        }
         
    }
}
