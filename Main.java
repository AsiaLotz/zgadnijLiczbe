package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r= new Random();
        int jakaToLiczba=r.nextInt(21);
        Scanner typ=new Scanner(System.in);
        System.out.println("Podaj liczbę od 0 do 20");
        int mójTyp=typ.nextInt();
         {
            if (mójTyp<jakaToLiczba)
                System.out.println("za mało");
            else System.out.println("za dużo");
            System.out.println("Spróbuj jeszcze raz");
            mójTyp = typ.nextInt();
        }
        System.out.println("Zgadłeś");

        }

    }
