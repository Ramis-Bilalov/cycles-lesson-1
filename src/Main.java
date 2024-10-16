public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println("Задача 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2

        System.out.println("\nЗадача 2.");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задача 3.

        System.out.println("\nЗадача 3.");
        for (int i = 0; i <= 16; i+=2) {
            System.out.println(i);
        }

        // Задача 4.

        System.out.println("\nЗадача 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5.

        System.out.println("\nЗадача 5.");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6.

        System.out.println("\nЗадача 6.");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }

        // Задача 7.

        System.out.println("\nЗадача 7.");
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }

        // Задача 8.

        System.out.println("\nЗадача 8.");

        int savings = 0;
        int monthInvestment = 29000;

        for (int i = 1; i <= 12; i++) {
            savings = savings + 29000;
            System.out.println("Накопления за " + i + "-ый(ой) месяц " + savings + " рублей.");
        }
        System.out.println("\nОбщая сумма накоплений: " + savings + " рублей.");

        // Задача 9.

        System.out.println("\nЗадача 9.");

        savings = 0;

        for (int i = 1; i <= 12; i++) {
            savings = savings + monthInvestment + savings/100;
            System.out.println("Накопления за " + i + "-ый(ой) месяц c учетом процентов " + savings + " рублей.");
        }
        System.out.println("\nОбщая сумма накоплений с учетом процентов: " + savings + " рублей.");

        // Задача 10.

        System.out.println("\nЗадача 10.");

        int multiplicationResult;
        for (int i = 1; i <= 10; i++) {
            multiplicationResult = 2 * i;
            System.out.println("2 * " + i + " = " + multiplicationResult);
        }
    }
}