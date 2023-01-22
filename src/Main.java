public class Main {
    public static void main(String[] args) {

        int amount = 10000; // стоимость билета

        int mile = 20; // стоимость бонусной мили
        int bonus = amount / mile; // расчет бонусов

        System.out.println("Количество бонусных миль:" + bonus);

    }
}