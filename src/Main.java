public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //Task 2
        System.out.println("Task 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase()); // МЕТОД toUpperCase - меняющий регистр строки на верхний
        //Task 3
        System.out.println("Task 3");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName1.replace('ё', 'е'));
    }
}