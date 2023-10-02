import java.util.Scanner;
public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        int day = 13;

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            day = 12;
        }
        System.out.println(day + ".09." + year);
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            return true;
        }
        return false;
    }
}
