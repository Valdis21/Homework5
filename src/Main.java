public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 1; // 0 = iOS, 1 = Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        int clientDeviseYear = 2015; // условия 2-ой задачи
        if (clientOS == 0 && clientDeviseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviseYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Задача 3
        int year = 2021;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год явлается високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задача 4
        int deliveryDistante = 95;
        if (deliveryDistante < 20) {
            System.out.println("Потребуется дней: 1 сутки");
        } else if (deliveryDistante >= 20 && deliveryDistante < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistante >= 60 && deliveryDistante < 100) {
            System.out.println("Потребуется дней доставки: 3");
        } else {
            System.out.println("Доставки нет.");
        }

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Принадлежит к сезону: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону: осень");
                break;
            default:
                System.out.println("Не верно указан номер месяца.");
        }
    }
}
