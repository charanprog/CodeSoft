import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        System.out.println("Welcome Dear! let's play NumbersGame.");
        System.out.print("""
                Here is game Intro
                1.The Game will be simple & Interesting\

                2.I will generate a Number,You Need to Guess that.\

                3.Remember you will have only 8 Chances.
                """);
        Scanner input = new Scanner(System.in);
        int random = randomnumber(1, 100);
        int chances = 9;
        int Score = 0;
        boolean play = true;
        while (play) {
            boolean guess = false;
            for (int i = 1; i < chances; i++) {
                System.out.println("Here is your" + " " + i + " " + "Chance" + "\nEnter your Guess: ");
                int Number = input.nextInt();
                if (Number == random) {
                    guess = true;
                    System.out.println("Perfect!Your Guess is correct,You Won It!");
                    Score += 1;
                    break;
                } if (Number > random) {
                    System.out.println("Your Guess is Bigger ! try again");
                } if (Number < random) {
                    System.out.println("Your Guess is smaller! try again ");
                }
            }
            if (!guess) {
                System.out.println("Oh No!You'r Chances are Over!Here is the Number: " + random);
            }
            System.out.println("Do you want to play again ?" + ("YES/NO"));
            String playagain = input.next();
            play = playagain.equalsIgnoreCase("YES");

        }
        System.out.println("Game Over !");
        System.out.println("Here is your FinalScore:\n" + Score );
    }
    public static int randomnumber ( int min, int max){
            return (int) (Math.random() * (max - min + 1) + min);
        }
    }

