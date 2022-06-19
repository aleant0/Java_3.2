public class Main {
    public static void main(String[] args) {

        int balance = 100;  // кол-во денег на счету до пополнения
        int deposit = 1100; // размер пополнения

        int bonus = deposit < 1000 ? 0 : deposit / 100;
        balance = balance + deposit + bonus;

        System.out.println("Зачислено бонусов: " + bonus);
        System.out.println("Баланс с учетом бонусов: " + balance);

    }
}
