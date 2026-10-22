package com.pluralsight;

public class Dice {

    public static void main(String[] args) {
        int roll1;
        int roll2;
        int sum;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = roll();
            roll2 = roll();
            sum = roll1 + roll2;
            System.out.println("You rolled "
                    + roll1 + " and " + roll2
                    + " Sum= " + sum);

            switch (sum) {
                case 2:
                    twoCounter++;
                    break;

                case 4:
                    fourCounter++;
                    break;

                case 6:
                    sixCounter++;
                    break;

                case 7:
                    sevenCounter++;
                    break;
            }
        }

        System.out.println("2 was rolled " + twoCounter + " times");
        System.out.println("4 was rolled " + fourCounter + " times");
        System.out.println("6 was rolled " + sixCounter + " times");
        System.out.println("7 was rolled " + sevenCounter + " times");
    }

    static int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}