public class Main {
    public static void main(String[] args) {

        int score = 200; // Счет абонента
        System.out.println("Сумма на счете до зачисления: " + (score) + " рублей");

        int replenishment = 1000; // Сумма пополнения счета
        System.out.println("Внесено на счет: " + (replenishment) + " рублей");

        int bonus = 200; // шаг бонуса начисления

        if (replenishment >= 1000) {
            System.out.println("Начислено бонусов: " + (replenishment / bonus) + " рублей");
            System.out.println("Итого на счете: " + (replenishment + score + (replenishment / bonus)) + " рублей");
        } else {
            System.out.println("Итого на счете: " + (replenishment + score) + " рублей");
        }


    }
}
