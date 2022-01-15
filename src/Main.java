public class Main {
    public static void main(String[] args) {
        // вход
        int BalansIn = 100;
        int amount = 1500;

        // логика
        int BonusBalans;
        if (amount > 100) {
            BonusBalans = amount / 100;
        } else {
            BonusBalans = 0;
        }

        int BalansOut =BalansIn + amount + BonusBalans;

        System.out.println("Ваш баланс составляет " + BalansOut + " рублей");
    }
    }



