
public class StringCollection  {
    public static String s [] = new String[10];
    private static int count=0;


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



    public static boolean  add(int index, String o) {
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


    public static Object get(int index) {
        Object o = new Object();
        for (int i=0;i<count;i++) {
            if (i == index) {
                o = s[i];
            }


        }
        return o;
    }


    public static boolean contain(Object o) {
        boolean is = false;
        for (int i=0;i<count;i++) {
            if (s[i] == o) {
                is = true;
            }

        }
        return is;
    }


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


    public static boolean clear() {
        boolean c = false;
        for (int i=0;i<count;i++) {
            s[i] = null;
            c = true;
        }
        count = 0;
        return c;
    }


    public static int size() {
        return count;
    }


}

