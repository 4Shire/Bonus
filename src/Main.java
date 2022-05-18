public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;               // Сумма на счету абонента
        int depositAmount = 1000;              // Сумма пополнения
        int niceBonus;

        if (depositAmount > 1000) {            // Бонус есть

            System.out.println("Ваш бонус за пополнение - " + (niceBonus = depositAmount / 100) + " руб.");
            System.out.println("Сумма на Вашем счету - " + (niceBonus + depositAmount + initialAmount) + " руб.");
        }

        if (depositAmount <= 1000) {            // Бонуса нет
            System.out.println("Сожалеем, суммы пополнения не хватило для начисления бонуса :( ");
            System.out.println("Сумма на Вашем счету - " + (initialAmount + depositAmount) + " руб.");
        }

    }
}
