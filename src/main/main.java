package main;

import java.util.Scanner;
import linkedList.LinkedList;
import wordle.Categories;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList random = new LinkedList();
        LinkedList guess = new LinkedList();
        LinkedList copy = new LinkedList();
        Categories cat = new Categories();
        Handler h = new Handler();

        System.out.println("Welcome to War OF Words! ");
        String start;
        do {
            System.out.println("press 1 to start game , press 2 to close the game, press 3 for documentaion on how the game works");
            start = scan.nextLine();
            if (start.equals("3")) {
                System.out.println("It is a wordle-like game , you start by choosing a category and difficulty, \nthen you have 6 tries to guess the word(s), also you have two types of hints (depending on the difficulty). \nTry them out and see what happens!\n\u001b[32m[Green]\033[0m the character is in the right position.\n\u001b[33m[Yellow]\033[0m the character is in the word.\n\u001b[35m[Purple]\033[0m the character is in another word.\n\u001b[30m[Gray]\033[0m character is not right.\n");
            }
        } while (!start.equals("1") && !start.equals("2"));
        if (start.equals("2")) {
            System.out.println("Exiting the Game...");
        }
        if (start.equals("1")) {
            String repeat;
            do {
                String categ;
                do {
                    System.out.println("1: for Countries");
                    System.out.println("2: for Games");
                    System.out.println("3: for Movies");
                    System.out.println("4: for Currencies");
                    System.out.println("5: for Fruits");
                    System.out.println("6: for Animals");
                    System.out.println("7: for Instrumints");
                    System.out.println("8: for Special");
                    categ = scan.nextLine();
                } while (!categ.equals("1") && !categ.equals("2") && !categ.equals("3") && !categ.equals("4") && !categ.equals("5") && !categ.equals("6") && !categ.equals("7") && !categ.equals("8"));

                if (categ.equals("8")) {
                    String classic;

                    do {
                        System.out.println("1: for Classic");
                        System.out.println("2: for ???????");
                        classic = scan.nextLine();
                    } while (!classic.equals("1") && !classic.equals("2"));
                    if (classic.equals("1")) {
                        cat.classic();
                        h.clarun(cat, random, guess, copy);
                    }
                    if (classic.equals("2")) {
                        cat.special();
                        h.emrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("1")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eCountry();
                        h.emrun(cat, random, guess, copy);

                    }
                    if (diff.equals("2")) {
                        cat.mCountry();
                        h.emrun(cat, random, guess, copy);

                    }
                    if (diff.equals("3")) {
                        cat.hCountry();
                        h.hrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("2")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eGames();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mGames();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hGames();
                        h.hrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("3")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eMovies();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mMovies();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hMovies();
                        h.hrun(cat, random, guess, copy);
                    }
                }

                if (categ.equals("4")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eCoins();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mCoins();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hCoins();
                        h.hrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("5")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eFruit();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mFruit();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hFruit();
                        h.hrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("6")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eAnimal();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mAnimal();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hAnimal();
                        h.hrun(cat, random, guess, copy);
                    }
                }
                if (categ.equals("7")) {
                    h.emh();
                    String num = scan.next();
                    String diff = h.def(num);

                    if (diff.equals("1")) {
                        cat.eInstrument();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("2")) {
                        cat.mInstrument();
                        h.emrun(cat, random, guess, copy);
                    }
                    if (diff.equals("3")) {
                        cat.hInstrument();
                        h.hrun(cat, random, guess, copy);
                    }
                }

                System.out.println("Press 1 to play Again or anything to quit.");
                if (!categ.equals("8")) {
                    scan.nextLine();
                }
                repeat = scan.nextLine();
                h.rpsCheck = false;
                h.tries = 0;
            } while (repeat.equals("1"));
        }
        scan.close();
    }
}
