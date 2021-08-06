package HW15;

import java.util.Scanner;
public class RPS {
    //    Написать консольную игру камень ножницы бумага
//    пользователь должен выбирать количество игр и ввести свое имя
//    пользователь должен иметь возможность прервать игру
//    после прекращения игры пользователь должен увидеть результат
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name ");
        String userName = sc.nextLine();
        System.out.println("Enter number of games:");
        int games = sc.nextInt();
        int score=0;
        // Rock - paper - scissors       player
        String matrix [][] = {{"Draw","Win","Lose"}, // Rock
                {"Win","Draw","Win"},  // Paper
                {"Lose","Win","Draw"}};  // Scissors

        //Start
        for (int k =0;k<games;k++) {
            System.out.println("Enter ( 000 to end this game ),  (\"Rock 0  papers 1  scissors 2\"):  ");
            for (int i = sc.nextInt(); i < i + 1; i = 0) {
                if (i!=000) {
                    for (int j = (int) (Math.random() * (3 - 1)); j < j + 1; j = 0) {
                        System.out.println("Opponent: " + j);
                        System.out.println("result: " + matrix[i][j]);
                        if (matrix[i][j].equals("Win") || matrix[i][j].equals("Draw")) {
                            score++;
                        }
                        break;
                    }
                }
                else break;
                break;
            }
        }
        System.out.println("results: "+ userName +" - " + score);
    }
}