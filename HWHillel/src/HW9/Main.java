package HW9;

public class Main {
    public static void main(String[] args)
    { // Создание нового списка
        Collection theList = new Collection();
        theList.insertFirst("22"); // Вставка в начало списка
        theList.insertFirst("44");
        theList.insertFirst("66");
        theList.add("11"); // Вставка в конец списка
        theList.add("33");
        theList.add("55");
        theList.displayList(); // Вывод содержимого списка
        theList.deleteFirst(); // Удаление первых двух элементов
        theList.deleteFirst();
        theList.displayList(); // Повторный вывод
    }
}
