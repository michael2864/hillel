package HW2;

import java.util.Scanner;

public class AverBank {
    /*1. Программа, которая находит среднее арифметическое значение двух чисел.
2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.
В задании 1 и 2 числа вводить через аргументы приложения
*/
    public class Average {
        public static void main(String[] args) {
            // write your code here
            System.out.println("Your array");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            int counter = 0;
            int sum = 0;
            System.out.println("Array size : " + args.length);

            for (String str : args) {
                System.out.println(str);
                int i = Integer.valueOf(str);
                sum = sum + i;
                counter++;
            }
            System.out.println( "average \t=" + sum/counter);
        }
    }

    /*3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых,
        которые выплачивает банк, длительность вклада (лет). Вывести накопленную сумму денег за каждый год и
        начисленные проценты. (проценты сложные с капитализацией каждый месяц)*/
    class Bank {
        public static void main(String[] args) {
            float start = 0f;
            int percent = 0;
            int years = 0;
            Scanner myObj = new Scanner(System.in); //сканер

            System.out.println("Please enter start amount начальна сумма");
            String str = myObj.nextLine();
            start = Float.valueOf(str);

            System.out.println("Please enter percent of deposit  процент");
            String str1 = myObj.nextLine();
            percent= Integer.valueOf(str1);

            System.out.println("Please enter years of deposit  лет депозита");
            String str2 = myObj.nextLine();
            years = Integer.valueOf(str2);

            int month = years * 12;

            for (int i = 1; i < month + 1; i++) {
                start = start + (start * percent / 12) / 100;

                if (i % 12 == 0) {
                    System.out.println("Year " + i / 12 + " money amount  " + start);
                }
            }
        }
    }
}
