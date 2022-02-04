public class Main {
    public static void main(String[] args) {
        //входные данные
        int balance = 100;
        int payment = 701;

        //логика
        int bonus = payment / 100;
        if (payment <= 1000) {
            bonus = 0;
        }
            System.out.println("Ваш бонус: " + bonus);

        int balance1 = balance + payment + bonus;

        System.out.println("Ваш общий баланс: " + balance1);






    }
}
