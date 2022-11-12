package com.bridgelabz.com;

public class Gambler {
	public static void main(String[] args) {
     int STAKE = 100;
     int BET = 1;
    
        System.out.println("Welcome to Gambling Game");
        int print = 0;
        int start = (int) (Math.random() * 2);

        if (start == 1){
            System.out.println("You have won the stake == " + STAKE);
            
            print = STAKE + BET;
            System.out.println("You now have == " + print);
        }else {
            System.out.println("You have loss the stake == " + STAKE);
           
            print = STAKE - BET;
            System.out.println(" You now have == " + print);
        }
    }
}
