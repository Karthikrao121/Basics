package com.euler.project;

public class MultiplesOf3And5 {
	public static int sum = 0 ;
	
	public static int sumOfMultiplesOf3And5(int num){
		
		for(int i = 1 ; i < num ; i++){
			if(i%3 == 0 | i%5 == 0 ){
			sum = sum + i ;	
			}
		}
		return sum;
	}

}
