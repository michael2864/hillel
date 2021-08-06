package HW6;


//        a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
//        b) сведения об абонентах, которые пользовались междугородной связью;
//        c) сведения об абонентах в алфавитном порядке.
//        д) сведения об первых 10 абонентов у который самый большой трафик интернета

interface Select {
    public void excedsTown(int time);
    public void usedInt();
    public void getUser();
    public void biggestSize();
}

public class PhoneCalculate implements Select  {

    public PhoneCalculate() {
    }

    public Phone [] mas = new Phone[5];
    int c=0;

    public void setMas(Phone p) {
        if (c<mas.length) {
            this.mas[c] = p;}
        c++;
    }

    //        a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    @Override
    public void excedsTown(int time) {
        for (int i=0;i< mas.length;i++) {
            if (mas[i].getTownTime() >= time ) {
                mas[i].toString();
            }
        }
    }

    //        b) сведения об абонентах, которые пользовались междугородной связью;
    @Override
    public void usedInt() {
        for (int i=0;i< mas.length;i++) {
            if (mas[i].getTownTime() != 0 ) {
                mas[i].toString();
            }
        }
    }

    //        c) сведения об абонентах в алфавитном порядке.
    @Override
    public void getUser() {
        Phone [] temp = new Phone[1];
        for (int i=mas.length-1;i>=1 ;i--) {
            for (int j = 0; j < i; j++){
                if (mas[i].getSurName().compareTo(mas[i+1].getSurName()) < 0 ) {
                    temp[0]=mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=temp[0];
                }
            }
        }
    }

    //        д) сведения об первых 10 абонентов у который самый большой трафик интернета
    @Override
    public void biggestSize() {  //Отсортируем всех пользователей по обьему трафика
        Phone [] temp = new Phone[1];
        for (int i=mas.length-1;i>=1 ;i--) {
            for (int j = 0; j < i; j++){
                if (mas[i].getSize()<mas[i+1].getSize())  {

                    temp[0]=mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=temp[0];
                }

            }
        }
        //выведем всех пользователей
        for (int i=0;i< 10;i++) {
            mas[i].toString();
        }

    }
}

