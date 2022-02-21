import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int score = 200; // Счет абонента
        System.out.println("Сумма на счете до зачисления: " + (score) + " рублей");

        int Replenishment = 1500; // Сумма пополнения счета
        System.out.println("Внесено на счет: " + (Replenishment) + " рублей");

        int bonus = 100; // шаг бонуса начисления

        if (Replenishment >= 1000) {
            System.out.println("Начислено бонусов:" + (Replenishment / bonus) + " рублей");
            System.out.println("Итого на счете: " + (Replenishment + score + (Replenishment / bonus)) + " рублей");
        } else {
            System.out.println("Итого на счете: " + (Replenishment + score) + " рублей");
        }


    }
}
