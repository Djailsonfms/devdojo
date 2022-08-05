package maratonajava.academy.devdojo.maratonajava.Introducao;


class Aula02TiposPrimitivos{
    public static void main(String[] args){
        //int, float, double, char, byte, short, long, boolean
        //castng é forçaratravez de bum parenteses obrigando uma variavel aceitar outra
        //String é um tipom de referencia 
        int age = 10;
        int ageTwo =(int) 100100100100100100L;
        long bigNumber = 100000000L;
        double wageDouble = 2000;
        float wageFloat = 2500;
        byte ageByte = 127;
        short ageShort = 10;
        boolean realTrue = true;
        boolean realFalse = false;
        char caracter = 189;
        char caracterTwo = 190;
        String name = "Cabe um um grande texto";    
        String nameTwo = "Goku";    

        System.out.println("int "+age);
        System.out.println("int "+ageTwo);
        System.out.println("long "+bigNumber);
        System.out.println("double "+wageDouble);
        System.out.println("float "+wageFloat);
        System.out.println("byte "+ageByte);
        System.out.println("short "+ageShort);
        System.out.println("boolean "+realTrue);
        System.out.println("boolean "+realFalse);
        System.out.println("char "+caracter);
        System.out.println("char "+caracterTwo);  
        System.out.println("String "+ name);
        System.out.println("string "+ nameTwo);
    }
    
}