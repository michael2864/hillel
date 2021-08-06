package HW7;

//Реализовать простую коллекцию для String на базе массива.
//
//        добавить следующие методы для работы с коллекцией:
//
//        добавлять (add), (по индеку или значению)
//
//        удалять(delete), (по индексу или значению)
//
//        доставать по индексу (get),

import java.util.Arrays;

public class StrCollection {
    public String s [] = new String[5];

    private int count=s.length;
    // будем считать что массив полностью заполнен

    public boolean addByIndex (int x, String str) {
        String temp [] = new String [count*2];    // i for s     j for temp
        if (x<=s.length-1) {
            for (int i=0,j=0;i<count-1&&j<count;i++,j++) {
                if (i==x) {
                    temp[j]=str;
                    temp[j+1]=s[i];
                    j++;
                }
                else {temp[j]=s[i];};
            }
            s = temp;
            count = s.length;
            return true;

        }
        else return false;
    }



    public boolean add (String str) {
        String temp [] = new String [count*2];

        for (int i = 0; i < count - 1; i++) {
            if (s[i]==" ") {
                s[i] = str;
                break;
            }

        }
        return true;

    }


    public boolean deleteByIndex (int x) {
        String temp1 [] = new String [count*2];
        for (int i = 0,j=0;i<s.length&&j<s.length;i++,j++) {
            if (i==x) {temp1[i]=s[j+1];
                j++;
            }
            else {temp1[i]=s[j];}

        }
        s=temp1;
        return true;
    }

    public boolean deleteByValue (String str) {
        String temp1 [] = new String [count*2];
        for (int i = 0,j=0;i<s.length-1&&j<s.length;i++,j++) {
            if (s[i]==str) {temp1[i]=s[j+1];
                j++;
            }
            else {temp1[i]=s[j];}

        }
        s=temp1;
        return true;
    }

    public String get (int x) {
        String got;
        for (int i = 0;i<s.length-1;i++) {
            if (i==x) {
                got = s[i];
                return got;
            }


        }
        return "No such element";
    }



    public static void main(String[] args) {
        StrCollection sc = new StrCollection();

        sc.addByIndex(0, "1");
        sc.addByIndex(1, "7");
        sc.addByIndex(2, "0");
        sc.addByIndex(3, "4");
        sc.addByIndex(4, "2");


        sc.deleteByIndex(0);
        sc.deleteByValue("7");

        sc.add("8");
        sc.addByIndex(3, "3");
        System.out.println(sc.get(0));
        System.out.println(sc.get(1));
        System.out.println(sc.get(2));
        System.out.println(sc.get(3));
        System.out.println(sc.get(4));
    }
}