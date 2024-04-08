package com.calculator;

import java.util.Scanner;

public class Cubes implements CubeInterface{

	@Override
	public void getCube() {
		Scanner sc = new Scanner(System.in);
		int number ;
		System.out.println("You are performing Cube of a number :");
		while(true) {
			try {
				System.out.println("Enter Number :");
				number = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		int cube = number * number * number ;
		System.out.println("Cube of "+ number +" is "+ cube);
		
	}

}
