import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Z = 0;
        int X = 0;
        double otvet = 0.0;
        System.out.println("Введите число, которое нужно возвести в степень:");

        if (scanner.hasNextInt()) {
            Z = scanner.nextInt();

            System.out.println("Введите целую степень от -15 до 15:");

            if (scanner.hasNextInt()) {
                X = scanner.nextInt();

                if ((X > 15) || (X < -15)) {
                    System.out.println("Введеные данные степени некорректны");
                    System.exit(0);
                }
            } else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }

        if(X == 0) {
            System.out.println("Ответ: 1");
        }
        if(X < 0){
            X+=1;
            otvet = (1.0/Z);
            while(X != 0){
                otvet = otvet / Z;
                X += 1;
            }

        }
        if(X > 0) {
            otvet = Z;
            X -= 1;
            while(X != 0){
                otvet = otvet * Z;
                X -= 1;
            }
        }

        System.out.println("Ответ:" + otvet);
        scanner.close();
    }
}