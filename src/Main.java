public class Main {
    public static void main(String[] args) {

        int initialBalance = 1300;
        int addend = 300;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;

        }
        // int bonus = addend > 1000 ? addend / 100 : 0;
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
