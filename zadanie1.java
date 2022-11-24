import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int day_now = 25;
        int month_now = 11;
        int year_now = 2022;
        int day = 0;
        int month = 0;
        int year = 0;
        int year_Old = 0;
        int month_Old = 0;
        int day_Old = 0;
        int day_Old_ost = 0;
        



        System.out.println("Введите день вашего рождения:");
        if (scanner.hasNextInt()){
            day = scanner.nextInt();
            day_Old = day_now - day;
            if ((day > 31) || (day < 1)) {
                System.out.println("Данные дня введены некорректно");
                System.exit(0);
            }
            System.out.println("Введите месяц вашего рождения:");

            if (scanner.hasNextInt()){
                month = scanner.nextInt();
                month_Old = month_now - month;
                if ((month > 12) || (month < 1)) {
                    System.out.println("Данные месяца введены некорректно");
                    System.exit(0);
                }
                System.out.println("Введите год вашего рождения:");

                if (scanner.hasNextInt()){
                    year = scanner.nextInt();
                    if (year > 2022) {
                        System.out.println("Данные года введены некорректно");
                        System.exit(0);
                    }
                    year_Old = year_now - year;
                }
                else {
                    System.out.println("Введите целые числа в качестве значений!");
                    scanner.next();
                }

            }
            else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }
        /*Пытаемся избежать отрицательных чисел */



        day_Old = day_Old + (year_Old * 365) + (month_Old * 30);
        day_Old_ost = day_Old % 365;
        year_Old = (day_Old - day_Old_ost) / 365;
        day_Old =  day_Old_ost % 30;
        month_Old = (day_Old_ost - day_Old) / 30;
        System.out.println(year_Old + " лет, " + month_Old + " месяцев, " + day_Old + " дней.");

        scanner.close();
    }
}
