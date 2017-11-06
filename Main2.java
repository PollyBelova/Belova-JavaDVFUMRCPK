package Belova;

//4. Условный оператор. 1.Ввести число, и определить – чётное оно, или нет.

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

                int num;
                System.out.println("Введите число: ");

                //Введенное число в консоле хранится в переменной num

                Scanner input = new Scanner(System.in);
                num = input.nextInt();

                // Если число делится на 2, то это четное число, иначе - нечетное
                // если остаток от деления равен нулю, то четное

                if ( num % 2 == 0 )
                    System.out.println("Число четное");
                else
                    System.out.println("Число нечетное");
            }
    }

