package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    static void main(String[] args) {
        int[] scores = {87, 92, 78, 95, 88, 73, 99, 84, 91, 86};

        int total = 0;
        int highScore = scores[0];
        int lowScore = scores[0];

        for (int score : scores) {
            total += score;

            if (score > highScore) {
                highScore = score;
            }

            if (score < lowScore) {
                lowScore = score;
            }
        }

        double average = (double) total / scores.length;


        System.out.println("Average Score: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);

    }
}
