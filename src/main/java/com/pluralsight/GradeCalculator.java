package com.pluralsight;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = keyboard.nextLine();

        System.out.print("Test score 1: ");
        int score1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Test score 2: ");
        int score2 = keyboard.nextInt();
        keyboard.nextLine();


        System.out.print("Quiz score 1: ");
        int quiz1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Quiz score 2: ");
        int quiz2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Quiz score 3: ");
        int quiz3 = keyboard.nextInt();
        keyboard.nextLine();


        System.out.print("Homework score 1: ");
        int hw1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Homework score 2: ");
        int hw2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Homework score 3: ");
        int hw3 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Homework score 4: ");
        int hw4 = keyboard.nextInt();
        keyboard.nextLine();

        int av_qu = (quiz1 + quiz2 + quiz3) / 3;
        int av_sc = (score1 + score2) / 2;
        int av_hw = (hw1 + hw2 + hw3 + hw4) / 4;

        int weight_qu = av_sc * 4 / 10;
        int weight_sc = av_qu * 3 / 10;
        int weight_hw = av_hw * 3 / 10;
        int total_grade = weight_hw + weight_sc + weight_qu;
        char letter_grade = 'X';

        if (total_grade >= 90)
        { letter_grade = 'A';
        }
        else if (89 >= total_grade && total_grade >= 80) {
            letter_grade = 'B'; }
            else if (79 >= total_grade && total_grade >= 70) {
                letter_grade = 'C';
            }
            else if (69 >= total_grade && total_grade >= 60) {
                letter_grade = 'D'; }
                else {
                    letter_grade = 'F';
            }







        System.out.printf("=== Grade Report for " + name + " === \n");
        System.out.printf("Category Averages: " + "\n");
        System.out.printf("Tests: " + av_sc + "\n");
        System.out.printf("Quizzes: " + av_qu + "\n");
        System.out.printf("Homeworks: " + av_hw + "\n");
        System.out.printf("Weighted Final Grade: " + total_grade + "\n");
        System.out.printf("Letter Grade: " + letter_grade + "\n");






} }
