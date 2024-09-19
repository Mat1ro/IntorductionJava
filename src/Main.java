import java.time.LocalDate;

public class Main {
    // task 1
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // task 2
    public static void updateOs(int osId, int year) {
        String os;
        if (osId == 1) {
            os = "iOS";
        } else {
            os = "Android";
        }
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            System.out.println("Установите облегченную версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + os + " по ссылке");
        }
    }

    // task 3
    public static int countDeliveryDays(int distance) {
        int result = 0;
        if (distance < 20) {
            result += 1;
        } else if (distance < 60) {
            result += 2;
        } else if (distance < 100) {
            result += 3;
        } else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        checkYear(2021);
        checkYear(2016);
        checkYear(1934);

        updateOs(1, 2021);
        updateOs(0, 2024);
        updateOs(1, 1942);

        int deliveryDistance = 95;
        int days = countDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Нет доставки");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

    }
}