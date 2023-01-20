public class Main {
    public static void main(String[] args) {

        int amount = 10000; // стоимость билета

        int mile = 20; // стоимость бонусной мили
        int bonus = amount/mile; // расчет бонусов

        System.out.println("Количество бонусных миль:" + bonus);

    }
}

class Main2 {
    public static void main(String[] args) {
        int balans = 100;
        int amount = 999;
        int calculation = amount / balans * 1;
        int bonus;
        if (amount > 999) {
            bonus = calculation + amount + balans;
        } else {
            bonus = balans + amount;
        }
        System.out.println("Баланс телефона:" + bonus);
    }
}