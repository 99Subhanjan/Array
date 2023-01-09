package com.project;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 1 + (int)(100 * Math.random() );

		System.out.println("Enter the number of trials");
		int trial = scan.nextInt();
		
		int i = 0;
		int j = 0;
		
		System.out.println("Enter the guessing number between 1 to 100");
		int guess;
		
		
		while(i != trial) {
			
			
			guess = scan.nextInt();
			
			if(guess > num) {
				System.out.println("Random number is less than " + guess + ".");
				i++;
				j++;
				continue ;
				
			}
			else if(guess < num) {
				System.out.println("Random number is greater than " + guess + ".");
				i++;
				j++;
				continue ;
				
			}
				else if(guess == num) {
					System.out.println("Congrulations you matched the randomnumber");
					break;
				}
			
			j++;
		}
		
		scan.close();
		
		if(j == trial) {
			System.out.println("you are out of trials. \nSorry you did not win the game."
					+ "\nrandom number is "+ num);
		}
	}
}
