package main;

import arrayList.ArrayList;
import java.util.Scanner;
import linkedList.LinkedList;
import wordle.Categories;
import rps.RockPaperScissors;

public class Handler {

    Scanner scan = new Scanner(System.in);
    ArrayList user = new ArrayList();
    ArrayList comp = new ArrayList();
    RockPaperScissors r = new RockPaperScissors();
    boolean winner;
    boolean rpsCheck = false;
    int tries = 0;

    public String dash(String da) {
        String dash = "";
        for (int i = 0; i < da.length(); i++) {
            if (da.charAt(i) != ' ') {
                dash += "-";
            } else {
                dash += " ";
            }
        }
        return dash;
    }

    public boolean wordCheck(String random, String guess) {
        if (random.length() != guess.length()) {
            return false;

        }
        for (int i = 0; i < random.length(); i++) {
            if (random.charAt(i) == ' ' && guess.charAt(i) != ' ') {
                return false;
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == ' ' && random.charAt(i) != ' ') {
                return false;
            }
        }

        return true;
    }

    public String def(String num) {

        switch (num) {
            case "1":
                return num;
            case "2":
                return num;
            case "3":
                return num;
            default:
                emh();
                System.out.println("please enter a value between 1 and 3");
                num = scan.nextLine();
                return def(num);
        }
    }

    public boolean rpsRun() {
        while (!user.isFull() && !comp.isFull()) {
            System.out.print("choose 0 rock, 1 paper, 2 scissors: ");
            int u = scan.nextInt();
            if (r.rpsGame(u) == 'c') {
                comp.push('c');
                System.out.println("comp took the point");
            } else if (r.rpsGame(u) == 'u') {
                user.push('u');
                System.out.println("user took the point");
            } else {
                System.out.println("DRAW!");
            }

            if (comp.isFull()) {
                System.out.println("Computer WON!");
                winner = false;
            }
            if (user.isFull()) {
                System.out.println("User WON!");
                winner = true;
            }
        }
        return winner;
    }

    public boolean hHint() {
        if (rpsCheck) {
            return true;
        } else {
            if (tries < 3) {
                user.clear();
                comp.clear();
                if (rpsRun()) {
                    rpsCheck = true;
                    scan.nextLine();
                    return true;
                } else {
                    tries++;
                    System.out.println("You have " + (3 - tries) + " tries left.");
                    scan.nextLine();
                    return false;
                }
            } else {
                System.out.println("You dont have any more tries left.");
                return false;
            }
        }
    }

    public void hrun(Categories cat, LinkedList random, LinkedList guess, LinkedList copy) {
        int i = 0;
        random.add(cat.getWord());
        String g = "";

        while (i < 6) {
            System.out.println("Enter a word matching the dashes or 1 for hint: ");
            System.out.println(dash(cat.getWord()));
            g = scan.nextLine();

            if (g.equals("1")) {
                if (hHint()) {
                    System.out.println(cat.getHint());
                }
            }
            if (wordCheck(cat.getWord(), g)) {
                guess.add(g);
                random.check(guess, copy);
                guess.print();
                if (cat.getWord().equalsIgnoreCase(g)) {
                    System.out.println("YOU ARE A WINNER");
                    break;
                }
                i++;
            }
        }

        if (i == 6) {
            System.out.println("The word was: ");
            random.print();
            System.out.println("YOU ARE A LOSER");
        }
    }

    public void emrun(Categories cat, LinkedList random, LinkedList guess, LinkedList copy) {
        int i = 0;
        random.add(cat.getWord());
        String g = "";

        while (i < 6) {
            if (i != 6) {
                System.out.println("Enter a word matching the dashes or 1 for hint: ");
                System.out.println(dash(cat.getWord()));
                g = scan.nextLine();
            }
            if (g.equals("1")) {
                System.out.println(cat.getHint());
            }
            if (wordCheck(cat.getWord(), g)) {
                guess.add(g);
                random.check(guess, copy);
                guess.print();
                if (cat.getWord().equalsIgnoreCase(g)) {
                    System.out.println("YOU ARE A WINNER");
                    break;
                }
                i++;
            }
        }

        if (i == 6) {
            System.out.println("The word was: ");
            random.print();
            System.out.println("YOU ARE A LOSER");
        }
    }

    public void clarun(Categories cat, LinkedList random, LinkedList guess, LinkedList copy) {
        int i = 0;
        random.add(cat.getWord());
        String g = "";

        while (i < 6) {
            if (i != 6) {
                System.out.println("Enter a word matching the dashes: ");
                System.out.println(dash(cat.getWord()));
                g = scan.nextLine();
            }
            if (wordCheck(cat.getWord(), g)) {
                guess.add(g);
                random.check(guess, copy);
                guess.print();
                if (cat.getWord().equalsIgnoreCase(g)) {
                    System.out.println("YOU ARE A WINNER");
                    break;
                }
                i++;
            }
        }

        if (i == 6) {
            System.out.println("The word was: ");
            random.print();
            System.out.println("YOU ARE A LOSER");
        }
    }

    public void emh() {
        System.out.println("1: for Easy");
        System.out.println("2: for Medium");
        System.out.println("3: for Hard");
    }
}
