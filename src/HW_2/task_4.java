package HW_2;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class task_4 {
        public static void printUserString() {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if (userInput.trim().isEmpty()) {
                throw new NullPointerException("Пустые строки вводить нельзя!");
            } else System.out.printf("Entered string: %s", userInput);
        }
}
