package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	

	
public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);    
//	    AdditionInterface add;
//	    SubtractionInterface sub;
//		MultiplicationInterface mul;
//		DivisionInterface div;
//		ModulusInterface mod;
//		SquareInterface sq;
//		CubeInterface c;
//		AverageInterface avg;
//		FactorsInteface fac;
//		EvenInterface ev;
		boolean flag = true;
		while(flag){
			System.out.println("Welcome to console based application\n"+
			        "1. Addition of two number\n" + 
					"2. Subtraction of two number\r\n" + 
					"3. Multiplication of two number\r\n" + 
					"4. Division of two number\r\n" + 
					"5. Modulus of two number\r\n" + 
					"6. Square of number\r\n" + 
					"7. Cube of number\n"+ 
					"8. Average of numbers\r\n" + 
					"9. Factors of numbers\r\n" + 
					"10.Find out even or odd number");		
			int choice =0;
					while(true) {
						try {
							System.out.println("Enter number From 1 to 10 Which operation you want to perform :");
							choice = sc.nextInt();							
							break;
						}
						catch(InputMismatchException e) {
//							e.printStackTrace();
							System.out.println("Expecting int type data ");
							System.out.println("Enter the int data between 1 to 10 ");
							sc.next();
						}						
					}
					if(choice >= 1 && choice <=10) {						
					switch (choice) {
					
					case 1:
//						 add = new Additions();
//						add.getAddition();
						break;				
					case 2:
//					    sub = new Subtractions();
//						sub.getSubtraction();
						break;					
					case 3:
//						mul = new Multiplications();
//						mul.getMultiplications();
						break;					
					case 4:
//						div = new Divisions();
//						div.getDivision();
						break;					
					case 5:
//						mod = new Moduluss();
//						mod.getModulus();
						break;					
					case 6:
//						sq = new Squares();
//						sq.getSquare();
						break;					
					case 7:
//						c = new Cubes();
//						c.getCube();
						break;					
					case 8:
//						avg = new Averages();
//						avg.getaverage();
						break;					
					case 9:
//						fac = new Factorss();
//						fac.getFactors();
						break;					
					case 10:
//						ev = new Evens();
//						ev.getEven();
						break;						
//						default :
//							System.out.println(choice +" This option is not avaiable ");
//							System.out.println("Select number between 1 to 10");
//							break;	
		}
	}
					else {
						System.out.println(choice +" This option is not avaiable ");
					}
					System.out.println("___________________________________________");
					while(true) {
						System.out.println("Do you want to perform more calculation :");
						System.out.println("Enter yes or no");
						String ans = sc.next();
						
						if(ans.equalsIgnoreCase("yes")) {
							flag = true;
							break;
						}
						else if(ans.equalsIgnoreCase("no")) {
							System.out.println("Thank you");
							flag = false;
							break;
						}
					}		
		}
}
}
