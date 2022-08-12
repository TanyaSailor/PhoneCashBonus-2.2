public class Main {
    public static void main(String[] args) {

        double cash = 650.5; // текущий счет клиента
        double pluss = 1700; // сумма пополнения счета

        int bonus;
        if (pluss > 1000) {
            bonus = (int) (pluss / 100); //бонус за пополнение

        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт:" + (cash + pluss + bonus));
        System.out.println("Начислено бонусных рублей:" + bonus);

    }
}
