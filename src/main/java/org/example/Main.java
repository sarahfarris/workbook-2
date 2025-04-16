package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the score? Input as Home:Visitor|x:x");
        Scanner user_input = new Scanner(System.in);
        String input = user_input.nextLine();
        // step 1: split the user input

        String[] teams = input.split(Pattern.quote("|"))[0].split(Pattern.quote(":"));
        String[] scores = input.split(Pattern.quote("|"))[1].split(Pattern.quote(":"));
        String home_score = scores[0];
        String visitor_score = scores[1];
        System.out.println("Home: " + home_score + " Visitor: " + visitor_score);

    }
}