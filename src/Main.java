public class Main {
    public static void main(String[] args) {
        String month;

        final int NUM = 7;

        String word = " weekday";

        month = NUM + word;

        System.out.println(month);

         if (NUM < 0){
             System.out.println("Вы сохранили отрицательное число");
         }else if (NUM > 0){
             System.out.println("Вы сохранили положительное число");
         }else {
             System.out.println("Вы сохранили ноль");
         }



    }
}