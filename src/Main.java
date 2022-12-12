public class Main {
    public static void main(String[] args) {
        String phone = "+925 725-777-9"; // Инициализация строки
        phone = phone.replace("-", ""); // МЕТОД replace (замена или удаление символа из строки)
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) { // МЕТОД lenght - длина строки
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный"); // Устойчивая конструкция, вывод сообщения об ошибке
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') { // МЕТОД charAt - чтение символа из строки
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79257257779";
        if (phone.equals(expectedPhone)) { // МЕТОД equals - сравнение строк
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }
        System.out.println(phone.charAt(10)); //распечатка 10-го символа из строки
    }
}