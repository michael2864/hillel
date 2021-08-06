package HW10;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

//1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
//        2. Написать итератор по коллекции реализованной в ДЗ -
//        3. написать программу для вычисления корней квадратного уравнения
public class HW10 {
    public class quad {
        static double a, b, c;
        static double D;
        static void getRoot () {
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            } else {
                System.out.println("Уравнение не имеет действительных корней!");
            }
        }
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    public class ArrayIterator<T> implements Iterator<T> {
        private T array[];
        private int pos = 0;

        public ArrayIterator(T anArray[]) {
            array = anArray;
        }

        public boolean hasNext() {
            return pos < array.length;
        }

        public T next() throws NoSuchElementException {
            if (hasNext())
                return array[pos++];
            else
                throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}