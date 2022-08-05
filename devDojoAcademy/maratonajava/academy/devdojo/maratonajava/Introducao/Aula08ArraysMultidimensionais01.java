package maratonajava.academy.devdojo.maratonajava.Introducao;

public class Aula08ArraysMultidimensionais01{
    public static void main(String[] args){
        // 1° arrays são os meses
        // 2° array são os dias

       /* String[] month = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Set","Out","Nov","Dez"};
        int[] day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,36};

        for(int i = 0; i < month.length; i++){
                System.out.println(month[i]);
            }*/

        
            int[][] days = new int[3][3];
            days[0][0]= 31;
            days[0][1]= 21;
            days[0][2]= 11;

            days[1][0]= 32;
            days[1][1]= 22;
            days[1][2]= 12;

            days[2][0]= 33;
            days[2][1]= 23;
            days[2][2]= 13;

           /* for (int i = 0; i < days.length; i++) {
                for (int j = 0; j < days[i].length; j++) {
                    System.out.println(days[i][j]);
                }
            }*/

            for(int[] arrayBase: days) {
                for(int num:arrayBase) {
                    System.out.println(num);
                }
            }

        }
    }

        

