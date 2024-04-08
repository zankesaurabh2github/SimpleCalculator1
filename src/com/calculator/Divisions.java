package com.calculator;

import java.util.Scanner;

public class Divisions implements DivisionInterface{

	@Override
	public void getDivision() {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor ;
		System.out.println("You are performing Division of two numbers :\n");
		while(true) {
			try {
				System.out.println("Enter Dividend Value :");
				dividend = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		while(true) {
			try {
				System.out.println("Enter Divisior Value :");
				divisor = sc.nextInt();
				if(divisor == 0) {
						throw new ArithmeticException();
				}
				break;
			}
			catch (ArithmeticException e){
				System.out.println("Cannot divide any number by 0 because division will be infinite");
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		int division = dividend / divisor;
		System.out.println("Division is "+ division);
		
	}

}
