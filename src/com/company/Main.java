package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("what is your favorite color?");
        Scanner sc = new Scanner(System.in);
        String yourColor = sc.nextLine();

        System.out.println(yourColor + ",nice to know");


        System.out.println("how old are you?");
        int yourAge = sc.nextInt();
        System.out.println("your age is: " + yourAge);

        System.out.println("what is your gender? (M/F)");
        Scanner secondScanner = new Scanner(System.in);
        String gender = secondScanner.nextLine().toUpperCase();

        if (yourAge == 25 || gender.equals ("M")) {
            System.out.println("you are 25 and you are male");
        }
        if (yourAge >= 25){
            System.out.println("welcome!");
        } else {
            System.out.println("not welcome");
        }
    }
}
