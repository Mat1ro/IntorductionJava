public class Main {
    public static void main(String[] args) {
        // task 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // task 3
        fullName = "Иванов Семён Семёнович".replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}