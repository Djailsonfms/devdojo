package maratonajava.academy.devdojo.maratonajava.Introducao;

/**
Pratica
Crie variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:
Eu <nome>. morando no endereço <endereço>, confirmo que recebi o salário de <salário>, 
na data<data>.
 */
public class Aula03TiposPrimitivoExercicio2{
 public static void main(String[] args){
    String name = "João";
    String address = "Av José Brumatti 3158";
    double salaryPay = 1500.05D;
    String datePay = "05/09/1992";
    String mensagem = "Eu "+name+". morando no endereço "+ address + ", confirmo que recebi o salário de "+salaryPay+
    ",na data "+datePay+".";

    System.out.println(mensagem);
 }
}
