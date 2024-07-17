public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

            System.out.println("Задача 2");

            clientOS = 0;
            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientOS == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            System.out.println("Задача 3");
            int year = 2024;
            if (year > 1584)
                System.out.println("Год должен быть больше чем 1584");
            if (year % 4 == 0 && year % 100 != 0 || year %  400 == 0) {
                System.out.println("Год " + year + " високостный");
            } else{
                System.out.println("Год " + year + " не является високостным");
            }


            System.out.println("Задача 4");
            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + days);
            }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребутся дней: " + (days + 1));
            }else if (deliveryDistance > 61 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: " + (days + 2));
            }else{
                System.out.println("Доставки нет");
            }


            System.out.println("Задача 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Этот месяц принадлежит к сезону Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Этот месяц принадлежит к сезону Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Этот месяц принадлежит к сезону Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Этот месяц принадлежит к сезону Осень");
                    break;
                default:
                    System.out.println("Такого сезона не существует");

            }
            }










    }
}