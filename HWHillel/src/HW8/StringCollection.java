package HW8;

//Реализовать простую коллекцию для String на базе массива использую интерфейс
//
//        Interface collection:

//        boolean add(Object o);
//        boolean add(index, Object o);
//        boolean delete (Object o);
//        Object get(int index);
//        boolean contain(Object o);
//        boolean equals (Collection str),
//        boolean clear(),
//        int size(),


public class StringCollection implements IntString {
    public String s [] = new String[10];
    private int count=0;

    @Override
    public static boolean add(String o) {
        String temp [] = new String [s.length+1];
        int i;
        for (i=0;i<=count;i++) {
            temp[i]=s[i];
        }
        temp[s.length]=o;
        count++;
        s = temp;
        return true;

    }


    @Override
    public boolean add(int index, String o) {
        String temp [] = new String [s.length+1];
        int i,j;

        for (i=0,j=0;i<count&&j<count;i++,j++){
            if (index!=i) {
                temp[j]=s[i];
            }
            else {
                temp[j+1]=s[i];
                temp[j]=o;

            }
        }
        s=temp;
        count++;
        return true;
    }

    @Override
    public static boolean delete(Object o) {
        String temp [] = new String [s.length];
        int i,j;
        for (i=0,j=0;i<count&&j<count;i++,j++){
            if (o != s[i] ) {
                temp[i] = s[i];
            }
            else {
                temp[j]=s[i+1];
                i++;
            }

        }
        s=temp;
        return true;
    }

    @Override
    public static Object get(int index) {
        Object o = new Object();
        for (int i=0;i<count;i++) {
            if (i == index) {
                o = s[i];
            }


        }
        return o;
    }

    @Override
    public static boolean contain(Object o) {
        boolean is = false;
        for (int i=0;i<count;i++) {
            if (s[i] == o) {
                is = true;
            }

        }
        return is;
    }

    @Override
    public static boolean equals(StringCollection str) {
        boolean eq = false;
        for (int i = 0;i<count;i++) {
            if (s[i].equals(str.get(i))) {
                eq= true;
            }
            else eq = false;
            break;

        }
        return eq;
    }

    @Override
    public boolean clear() {
        boolean c = false;
        for (int i=0;i<count;i++) {
            s[i] = null;
            c = true;
        }
        count = 0;
        return c;
    }

    @Override
    public int size() {
        return count;
    }


}