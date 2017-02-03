package com.euler.project;

import java.util.Scanner;

public class ProgramRun {
	
	public static void main(String[] args) {
		MultiplesOf3And5 mul = new MultiplesOf3And5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.println("The sum of multiples of 3 and 5 is:" + MultiplesOf3And5.sumOfMultiplesOf3And5(num) );
	}

}
