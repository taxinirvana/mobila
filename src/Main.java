public class Main {
    public static void main(String[] args) {
        //входные данные
        int balance = 100;
        int payment = 3000;

        //логика
        int bonus;
        if (payment >= 1000) {
             bonus = payment / 100;

        }  else {
            bonus = 0;
        }
        int balance1 = balance + payment + bonus;

            System.out.println("Ваш бонус: " + bonus);
            System.out.println("Ваш общий баланс: " + balance1);






    }
}
