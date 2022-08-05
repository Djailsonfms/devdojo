package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturasDeRepeticao04ExercicioBreak {
    // Given the value of car, find out how many installments can be paid in installments.
    //Condition value installment >= 1000
    public static void main(String[] args){
        double valueOfCar = 30000;

        for(int parcela = 1; parcela <= valueOfCar; parcela++){
            double valuePaymant = valueOfCar / parcela;
            if(valuePaymant >= 1000){
                System.out.println("Parcela "+parcela+" R$ "+valuePaymant);
            }else{
                break;
            }
            System.out.println("fora do If mas dentro do for");
           
        }
    }
    
}
