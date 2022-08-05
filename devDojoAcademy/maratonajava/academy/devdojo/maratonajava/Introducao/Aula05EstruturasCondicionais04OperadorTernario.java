package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula05EstruturasCondicionais04OperadorTernario{
    public static void main(String[] args){
        //Doar se Salário > 5000,00
        double wage =3000;
        String messageDonate = "I will donate 500,00 to the DevDojo";
        String messageDoNotDonate = "I still don't have conditions yet, but i will!";
        String result = wage > 5000 ? messageDonate : messageDoNotDonate;
        /*if(wage > 5000){
            result = messageDonate;
        }else {
            result = messageDoNotDonate;
        }*/
        System.out.println(result);
    }
}