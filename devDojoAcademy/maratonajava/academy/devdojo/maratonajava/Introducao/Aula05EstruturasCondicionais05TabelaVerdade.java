package maratonajava.academy.devdojo.maratonajava.Introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais05TabelaVerdade{
    // I want to know much i have to pay in the netherlands 2020 based on my salary
    // £ 0      £ 34712     9.70% 
    // £ 34713  £ 68507     37.35% 
    // £ 68508              49.50% 

    public static void main(String[] args){
        try(Scanner tc = new Scanner(System.in)){
            System.out.println("Digite o valor das sua hora de trabalho: ");
            double salaryHours = tc.nextDouble();
            System.out.println("Quantas horas você trabalho por dia: ");
            double workedHours = tc.nextDouble();
            System.out.println("Quantos dias você trabalha por mês: ");
            double workedDays = tc.nextDouble();
            double monthsOfTheYear = 12;
            double result = salaryHours*workedHours*workedDays*monthsOfTheYear;
            System.out.println("Seu salário anual é "+result);
            double taxes;
            double firstTrack = 9.7/100;
            double secondTrack = 37.35/100;
            double thirdTrack = 49.50/100;
            if(result <= 34712){
                taxes = result * firstTrack;
                System.out.println("Você paragará: "+ taxes+ "£ de impostos.");
            }else if(result >= 34713 && result <= 68507){
                taxes = result * secondTrack;
                System.out.println("Você paragará. "+ taxes+ "£ de impostos.");
            }else{
                taxes = result *thirdTrack;
                System.out.println("Você paragará "+ taxes+ "£ de impostos.");
            }
        }

    }
}