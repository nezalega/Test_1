package by.academy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson_2_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число A");
        double A = in.nextDouble();

        System.out.println("Введите число B");
        double B = in.nextDouble();

        if (A>B){
            System.out.println("A больше B " + A);
        }
        if (A<B){
            System.out.println("A меньше В " + B);
        }

            System.out.println("Среднее арифметическое " + (A+B)/2);
}}


