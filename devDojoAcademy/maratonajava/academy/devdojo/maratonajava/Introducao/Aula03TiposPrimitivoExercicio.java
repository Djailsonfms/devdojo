package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;
/**
Pratica
Crie variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:
Eu <nome>. morando no endereço <endereço>, confirmo que recebi o salário de <salário>, 
na data<data>.
 */
public class Aula03TiposPrimitivoExercicio {
    public static void main(String[] args){
        try (Scanner imput = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String name = imput.next();

            System.out.println("Digite seu endereço: ");
            String address = imput.next();

            System.out.println("Digite o valor recebido este mês: ");
            double wage = imput.nextDouble();

            System.out.println("Emque dia vocÊ recebeu seu salário: ");
            String pagamento = imput.next();

            String mensagen = "Eu "+ name +" morando no endereço "+ address +" , confirmo que recebi o salário de "
            + wage + ", na data "+pagamento ;

            System.out.println(mensagen);
        }
    }
}
