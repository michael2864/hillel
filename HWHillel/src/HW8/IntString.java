package HW8;

public interface IntString {
    boolean add(String o);
    boolean add(int index, String o);
    boolean delete (Object o);
    Object get(int index);
    boolean contain(Object o);
    boolean equals (StringCollection str);
    boolean clear();
    int size();
}