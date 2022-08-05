package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula04Operadores{
    /*
    São operadores que consegue realizar operaçoes matemáticas
    */
        public static void main(String[] args){
            // Adção +, Subtração -, Multiplicação *, Divisão / 
            int number1 = 10;
            int number2 = 20;
            int result = number1 +number2;
            System.out.println(number2 - number1);
            System.out.println(number2 + number1);
            System.out.println(number2 * number1);
            System.out.println(number2 / number1);
            System.out.println(result);
            System.out.println(number1 /(double) number2);

            // Operador de resto %  
            int rest = 20 % 7;
            System.out.println(rest);

            // Operadores Logicos Que sempre retornam um valor booleano
            // < menor, > maior, <= menor igual, >= maior igual, != diferente, == comparar/igual

            boolean isTenGreaterThanTwenty = 10 > 20;
            boolean isTenLessThanTwenty = 10 < 20;
            boolean isTenEqualsTwenty = 10 == 20;
            boolean isTenEqualsTen = 15 == 10;
            boolean isTenDifferentTen = 12 != 10;
            System.out.println("é 10 maior doque 20 "+isTenGreaterThanTwenty);
            System.out.println("é 10 menor doque 20 "+isTenLessThanTwenty);
            System.out.println("é 10 igual 20 "+isTenEqualsTwenty);
            System.out.println("é 10 igual 10 "+isTenEqualsTen);
            System.out.println("é 10 diferente de 10 "+isTenDifferentTen);

            //Operadores Logicos
            // &&(AND), || (OR), ! logical
        
            int age = 29;
            float wage = 3500F;
            boolean isWithinTheLawGreaterEqualsThanThirty = age >= 30 && wage > 4612;
            boolean isWithinTheLawLessThanThirty = age < 30 && wage > 3381;
            System.out.println("Esta dentro da lei maior que 30 "+isWithinTheLawGreaterEqualsThanThirty);
            System.out.println("Esta dentro da lei menor que 30 "+isWithinTheLawLessThanThirty);   
            

            double currentAccountTotalAmount = 200;
            double totalAmountSavingsAccount = 10000;
            float valuePlayStationFive = 5000F;

            boolean isPlayStationFiveBuyable = currentAccountTotalAmount > valuePlayStationFive || 
            totalAmountSavingsAccount > valuePlayStationFive;

            System.out.println("E play station cinco compravel "+isPlayStationFiveBuyable);


            // Operadores de Atribuição
            // Igual =, mais igual +=, menos igual -=, multiplicação igual *=, divisão igual /=,
            // resto igual %=

            double bonus = 1800; //1800
            bonus = bonus + 1000; // 2800
            bonus += 1000; // 3800
            bonus = bonus - 1000; //2800
            bonus -= 1000; //18000
            System.out.println("bonus = " + bonus);

            //Contador
            int counter = 0;
            counter = counter + 1;
            counter += 1;  // counter = counter + 1;
            counter ++; // counter = counter + 1;
            counter --; // counter = counter - 1;
            System.out.println("counter");

            int counter2 = 0;
            System.out.println(++counter2); // Primeiro incremente depois imprima
            System.out.println(counter2++); // Primeiro imprima e depois incremente

    }
}