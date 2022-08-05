package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula07Arrays021 {
    public static void main(String[] args){
    //byte, short, int, long, float e double : o tipo é 0
	//char : temos um unicode que representa um espaço em branco \ u000
	//boolean : é false
	//String : é null
    
    String[] name = new String[3];
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);

    byte[] number = new byte[3];
    System.out.println(number[0]);
    System.out.println(number[1]);
    System.out.println(number[2]);

    boolean[] falso = new boolean[4];
    System.out.println(falso[0]);
    System.out.println(falso[1]);
    System.out.println(falso[2]);
    System.out.println(falso[3]);
    }
}