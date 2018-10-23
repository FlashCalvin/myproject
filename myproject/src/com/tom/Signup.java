package com.tom;

import java.util.Scanner;

public class Signup {
	public static void main(String[]args) {
		System.out.println("Are you 18, y/n");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
	    boolean adult =line.toUpperCase().equals("Y");
		if (adult) {
			System.out.print("Your Age");
			int Age = scanner.nextInt();
			System.out.print("Your Name");
			int Name = scanner.nextInt();
			System.out.print("Your Nickname");
			int Nickname = scanner.nextInt();
			//System.out.println("Your Age 
			
		}   else {
			System.out.println("Subnormal Child, Goodbye");
		}
	}
		
		

	

	     


