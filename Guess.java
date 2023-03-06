import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(99) + 1;

        int maxAttempts = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        while (true) {
            System.out.println("Угадай число от 0 до 100");
            int count = s.nextInt();
            if (count == number) {
                System.out.println("Ты угадал с " + maxAttempts + " попытки!");
                break;
            } else if (count > number) {
                maxAttempts = maxAttempts - 1;
                System.out.println("Заданное число меньше!Осталось " + maxAttempts + " попыток");

            } else {
                maxAttempts = maxAttempts - 1;
                System.out.println("Заданное число больше!Осталось " + maxAttempts + " попыток");

            }
            if (maxAttempts == 0) {
                System.out.println("У вас закончились попытки:( Я загадал число " + number);
                break;
            }
        }
        s.close();
    }

}