package HW9;

//на основе интерфейса - реализовать коллекцию на основе связного списка


public class Collection implements CustomCollection {
    int count = 0;
    private Node first; // Ссылка на первый элемент
    private Node last; // Ссылка на последний элемент

    public boolean isEmpty() // true, если список пуст
    { return first==null; }

    public void insertFirst(String dd) // Вставка элемента в начало списка
    {
        Node newLink = new Node(dd); // Создание нового элемента
        if( isEmpty() ) // Если список пуст,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink

        newLink.index++;
        count++;
    }
    @Override
    public boolean add(String dd) // Вставка элемента в конец списка
    {
        Node newLink = new Node(dd); // Создание нового элемента

        if( isEmpty() ) {// Если список пуст,
            first = newLink; // first --> newLink
            newLink.index=0; }
        else {
            last.next = newLink; // Старое значение last --> newLink
            newLink.index = count-1;
            last = newLink; // newLink <-- last
        }
        count++;
        return true;

    }
    public String deleteFirst() // Удаление первого элемента списка
    { // (предполагается, что список не пуст)
        String temp = first.data;
        if(first.next == null) // Если только один элемент
            last = null; // null <-- last
        first = first.next; // first --> старое значение next
        count--;
        return temp;
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Node current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }




    @Override
    public boolean addAll(String[] strArr) {
        Node current = first; // От начала списка
        int temp = count;
        count = 0;
        while(current != null ) // Перемещение до конца списка
        {
            current.data = strArr[count];current = current.next;

            count++;
        }
        count = temp;
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        return true;
    }



    @Override
    public boolean delete(int index) {
        int counter = 0;
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            do {current.data = null;current = current.next;}

            while (current.index == index);
        }
        return true;
    }


    public boolean deleteS (String str) {
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            do {current.data = null;current = current.next;}

            while (current.data.equals(str) );
        }

        return true;
    }

    @Override
    public String get(int index) {
        String temp=null;
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            do {temp = current.data; }

            while (current.index == index);
        }

        return temp;
    }

    @Override
    public boolean contains(String str) {
        boolean b=false;
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            if (current.data.equals(str)) {
                b=true;
            }
            else {b=false;}
        }

        return b;
    }

    @Override
    public boolean clear() {
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            current.data = null;current = current.next;


        }

        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean trim() {
        Node current = first; // От начала списка
        while(current != null ) // Перемещение до конца списка
        {
            do {System.out.println("");}

            while (current.data != null);
        }
        return true;
    }

    @Override
    public boolean compare(Collection coll) {

        return true;
    }


}
class Node {
    public String data; // Данные
    public int index;
    public Node next;

    public Node(String dd) // Конструктор
    { data = dd; }
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(data + " "); }
    public String GetLink() // Вывод содержимого элемента
    { return data;}

    public String getData() {
        return data;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
