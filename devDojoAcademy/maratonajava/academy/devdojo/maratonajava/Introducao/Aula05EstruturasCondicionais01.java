package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula05EstruturasCondicionais01{
    public static void main(String[] args){
        int age = 18;
        boolean isAuthorizedToBuyDrink = age >= 18;
        // !
        if(isAuthorizedToBuyDrink){
            System.out.println("Autorizado a comprar bebida alcólica");
        } else{
            System.out.println("Não autorizado a comprar bebida");
        }
        if(!isAuthorizedToBuyDrink ){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.println("Fora do if");
    }     
}