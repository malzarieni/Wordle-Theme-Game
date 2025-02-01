package rps;

public class RockPaperScissors {

    public char rpsGame(int u) {
        int c = (int) (Math.random() * 3);
        char check = 't';

        switch (c) {
            case 0:
//                System.out.println("The computer chose Rock!");
                switch (u) {
                    case 0:
//                        System.out.println("You chose Rock! It's a draw!");
                        check = 'd';
                        break;
                    case 1:
//                        System.out.println("You chose Paper! You win!");
                        check = 'u';
                        break;
                    case 2:
//                        System.out.println("You chose Scissors! You lose!");
                        check = 'c';
                        break;
                }
                break;
            case 1:
//                System.out.println("The computer chose Paper!");
                switch (u) {
                    case 0:
//                        System.out.println("You chose Rock! You lose!");
                        check = 'c';
                        break;
                    case 1:
//                        System.out.println("You chose Paper! It's a draw!");
                        check = 'd';
                        break;
                    case 2:
//                        System.out.println("You chose Scissors! You win!");
                        check = 'u';
                        break;
                }
                break;
            case 2:
//                System.out.println("The computer chose Scissors!");
                switch (u) {
                    case 0:
//                        System.out.println("You chose Rock! You win!");
                        check = 'u';
                        break;
                    case 1:
//                        System.out.println("You chose Paper! You lose!");
                        check = 'c';
                        break;
                    case 2:
//                        System.out.println("You chose Scissors! It's a draw");
                        check = 'd';
                        break;
                }
                break;
        }
        return check;

    }
}
