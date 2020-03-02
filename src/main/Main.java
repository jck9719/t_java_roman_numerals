package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

	    RomanNumeral romanNumeral = new RomanNumeral(n);
        System.out.println(romanNumeral.getRomanNumeral());
    }
}
