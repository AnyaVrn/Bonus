public class Main {
    public static void main(String[] args) {
        int amount = 2500; //сумма пополнения счета
        int bonus = 100; //сумма начисления одного бонуса
        if (amount > 1000) {
            System.out.println("За вашу покупку будет начисленно:");
            System.out.println((amount/bonus) + " бонусов");
        }else{
            System.out.println("Сумма пополнения счета менее 1000 руб, бонусы не начисляются");
        }

    }
}