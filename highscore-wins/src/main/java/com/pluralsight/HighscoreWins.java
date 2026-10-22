package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {
    static void main(String[] args) {
        //Home:Visitor|21:9
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str=input.nextLine();
        stringParser(str);
    }
    static void stringParser(String str){
        String[] tokens = str.split(Pattern.quote("|"));
        String Teams=tokens[0];
        String Scores=tokens[1];
        String[] teams = Teams.split(Pattern.quote(":"));
        String[] scores = Scores.split(Pattern.quote(":"));
        int ScoreTeam1=Integer.parseInt(scores[0]);
        int ScoreTeam2=Integer.parseInt(scores[1]);
        if(ScoreTeam1==ScoreTeam2){
            System.out.println("Its A Tie");
        } else if (ScoreTeam1>ScoreTeam2) {
            System.out.println("Winner: "+teams[0]);
        } else if (ScoreTeam2>ScoreTeam1) {
        System.out.println( "Winner: "+teams[1]);
    }
    }
}
