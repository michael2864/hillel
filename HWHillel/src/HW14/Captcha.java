package HW14;

//Рисовалка цифр
//        Требуется написать метод который на вход будет принимать последовательности цифр,
//        а выводить на экран в псевдографику в одну строчку как в приложении,
//        добавить проверку что все знаки цифры
//        результатом должен быть исполняемый jar file

import java.util.Scanner;

public class Captcha {

    String zero [] =  {"*$$$$*", "$$**$$", "$$**$$", "$$**$$", "*$$$$*"};
    String one [] =   {"**$$**", "*$$$**", "$*$$**", "**$$**", "$$$$$$"};
    String two [] =   {"*$$$$*", "$$**$$", "***$$*", "**$$**", "$$$$$$"};
    String three [] = {"*$$$$*", "$$**$$", "***$$*", "$$**$$", "*$$$$*"};
    String four [] =  {"$$**$$", "$$**$$", "$$$$$$", "****$$", "****$$"};
    String five [] =  {"$$$$$$", "$$****", "$$$$$*", "****$$", "$$$$$*"};
    String six [] =   {"*$$$$$", "$$****", "$$$$$*", "$$**$$", "*$$$$*"};
    String seven [] = {"$$$$$$", "***$$*", "**$$**", "*$$***", "$$****"};
    String eight [] = {"*$$$$*", "$$**$$", "*$$$$*", "$$**$$", "*$$$$*"};
    String nine [] =  {"*$$$$$", "$$**$$", "*$$$$$", "****$$", "*$$$$*"};
    String spc [] = {"--"};

    String matrix [] [] = { {"*$$$$*","**$$**","*$$$$*","*$$$$*","$$**$$","$$$$$$","*$$$$$","$$$$$$","*$$$$*","*$$$$$"},
            {"$$**$$","*$$$**","$$**$$","$$**$$","$$**$$","$$****","$$****","***$$*","$$**$$","$$**$$"},
            {"$$**$$","$*$$**","***$$*","***$$*","$$$$$$","$$$$$*","$$$$$*","**$$**","*$$$$*","*$$$$$"},
            {"$$**$$","**$$**","**$$**","$$**$$","****$$","****$$","$$**$$","*$$***","$$**$$","****$$"},
            {"*$$$$*","$$$$$$","$$$$$$","*$$$$*","****$$","$$$$$*","*$$$$*","$$****","*$$$$*","*$$$$*"},};

    void printNumber (char [] number) {
        boolean t = false;
        for (int i =0;i<number.length;i++ ) {
            if (Character.isDigit(number[i])) {
                t=true;
            }
            else {
                t=false;
                System.out.println(number[i] + "is not number");
                break;}
        }
        if (t) {
            for (int i=0;i< 5;i++) {
                System.out.println("");
                for (int j=0;j< number.length;j++) {
                    int n = Character.getNumericValue(number[j]);
                    System.out.print(matrix[i][n]);
                    System.out.print("****");

                } }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner s = new Scanner(System.in);
        char [] num = s.next().toCharArray();
        Captcha ccg = new Captcha();
        // char number [] = {'1','3','5'};
        ccg.printNumber(num);
    }
}





