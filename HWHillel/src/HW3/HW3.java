package HW3;
import java.util.Scanner;
import java.util.Arrays;

/*При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        Дано число n при помощи цикла for посчитать факториал n!
        Перепишите программы с использованием цикла while.
        Перепишите программы с использованием цикла do - while.
        Даны переменные x и n вычислить x^n.
        Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
        Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
        Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько - вывести их все).
        В массиве из задания 9. найти наибольший элемент.
        Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        Найти среднее арифметическое всех элементов массива.*/

public class HW3 {

    public class OneToNine {
        public static void main(String args[]) {
//1 При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//        int i;
//        for (i=0;i<100;i++) {
//            if (i%2 == 1) {
//                System.out.println("Number: " + i);
//            }
//        }
//3   Перепишите программы с использованием цикла while.
//        int i=1;
//        while (i<100 ) {
//            if (i%2 == 1){
//
//            System.out.println("Number: " + i);
//            i++;}
//            else {i++;};
//        }
            //     4   Перепишите программы с использованием цикла do - while.
            int i=1;
            do {if (i%2 == 1) {System.out.println("Number: " + i);
                i++;}
            else i++;}
            while (i<100);
        }
    }

    public class Row {
        public static void main(String[] args) {
//  6 Вывести 10 первых чисел последовательности 0, -5,-10,-15..
            int i;
            int count=1;
            for (i = 0;i>-50 && count <=10;i=i-5,count++) {
                System.out.println("Number " + i);
            }
        }
    }

    public class factorial {
        public static void main(String[] args) {
//2  Дано число n при помощи цикла for посчитать факториал n!
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter n");
            int n = myObj.nextInt();
            int outp = 1;
            int i = 1;
//        for (int i = 1; i <= n; i++) {
//            outp = outp * i;
//        }
//        System.out.println("factorial = " + outp);
            //3   Перепишите программы с использованием цикла while.
            while (i <= n) {
                outp = outp * i;
                i++;
            };
            //     4   Перепишите программы с использованием цикла do - while.
            do {
                outp = outp * i;
                i++;
            }
            while (i <= n);
            System.out.println("factorial = " + outp);
        }
    }

    public class pow {
        public static void main(String[] args) {
            //     5  Даны переменные x и n вычислить x^n.
            int x = 2;
            int n = 4;
            int result = 1;
            while (n != 0)
            {
                result *= x;
                --n;
            }
            System.out.println("Result " + result);
        }
    }

    public class Mass {
        //     9 Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести и
        public static int MinValue(int[] values){   //minvalue
            int retur = values[0];
            for(int i = 1; i < values.length; i++)
                retur = Math.min(retur,values[i]);
            return retur;
        }
        //      10 В массиве из задания 9. найти наибольший элемент.
        public static int MaxValue(int[] values){   //maxvalue
            int retur = values[0];
            for(int i = 1; i < values.length; i++)
                retur = Math.max(retur,values[i]);
            return retur;
        }
        //       11 Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
        public static int[] SwapMinMax(int[] values) {
            int min = values[0];
            int max = values[0];
            int idMin = 0;
            int idMax = 0;

            for (int i = 0; i < values.length; i++) {

                if (min > values[i]) {
                    min = values[i];
                    idMin = i;
                }
                if (max < values[i]) {
                    max = values[i];
                    idMax = i;
                }
            }
            values[idMin] = max;
            values[idMax] = min;
            return values;
        }
        //       12 Найти среднее арифметическое всех элементов массива.
        public static double Average(int[] values) {
            double sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum / values.length;
        }

        public static void main(String[] args) {
            //     8 Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.

            String [] mas = new String[] { "1","3","5","7","9","11","13","15","17","19" };

            System.out.println(String.join(", ", mas));
            int [] num = new int [] {4, -5, 0, 6, 8, 11, 18, -2, 0, 5, 33};
            Mass.Average(num);
            Mass.MaxValue(num);
            Mass.MinValue(num);
            Mass.SwapMinMax(num);

        }
    }

    public class MultiTable {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter var ");
            int var = myObj.nextInt();
            for (int i=2; i<100; i++){
                System.out.println(var +" x "+ i + " = " + var*i);
            }
//      Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)

        }
    }



}
