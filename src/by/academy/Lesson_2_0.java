package by.academy;

import java.util.Scanner;

public class Lesson_2_0 {

    public static void main (String [] args) {

        System.out.println ("Введите название месяца: ");

        Scanner Vvod = new Scanner(System.in);
        String value = Vvod.next();

        switch (value) {

            case "Январь":
            {   System.out.println ("Номер месяца 1 ");
                break;}
            case "Февраль":
            {   System.out.println ("Номер месяца 2 ");
                break;}
            case "Март":
            {   System.out.println ("Номер месяца 3 ");
                break;}
            case "Апрель":
            {   System.out.println ("Номер месяца 4 ");
                break;}
            case "Май":
            {   System.out.println ("Номер месяца 5 ");
                break;}
            case "Июнь":
            {   System.out.println ("Номер месяца 6 ");
                break;}
            case "Июль":
            {   System.out.println ("Номер месяца 7 ");
                break;}
            case "Август":
            {   System.out.println ("Номер месяца 8 ");
                break;}
            case "Сентябрь":
            {   System.out.println ("Номер месяца 9 ");
                break;}
            case "Октябрь":
            {   System.out.println ("Номер месяца 10 ");
                break;}
            case "Ноябрь":
            {   System.out.println ("Номер месяца 11 ");
                break;}
            case "Декабрь":
            {   System.out.println ("Номер месяца 12 ");
                break;}
            default: {
                System.out.println ("Необходимо выбрать существующий месяц");
                break;}}
    }
}


