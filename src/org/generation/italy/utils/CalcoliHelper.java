package org.generation.italy.utils;

public class CalcoliHelper {
	
	//somma
	public static int somma (int num1,int num2) {
		return num1 + num2;
	}
	public static double somma (double num1,double num2) {
		return num1 + num2;
	}
	//differenza
	public static int diff (int num1,int num2) {
		return num1 - num2;
	}
	public static double diff (double num1,double num2) {
		return num1 - num2;
	}
	
	//moltiplicazione
	public static int per (int num1,int num2) {
		return num1 * num2;
	}
	public static double per (double num1,double num2) {
		return num1 * num2;
	}
	//valore assoluto
	public static int assoluto (int num) {
		if (num >= 0) {
			return num;
		}else {
			return num * (-1);
		}
			
	}
	public static double assoluto (double num) {
		if (num >= 0) {
			return num;
		} else {
			return num * (-1);
		}
	}
	//massimo
	public static int max (int num1,int num2) {
		if(num1<num2) {
			return num2;
		}else{
			return num1;
		}	
	}
	public static double max (double num1,double num2) {
		if(num1<num2) {
			return num2;
		}else{
			return num1;
		}
	}
	//minimo
	public static int min (int num1,int num2) {
		if(num1>num2) {
			return num2;
		}else{
			return num1;
		}
			
	}
	public static double min (double num1,double num2) {
		if(num1>num2) {
			return num2;
		}else{
			return num1;
		}
	}
	//elevazione a potenza
	public static double pot (int num1,int num2) {
		double calcolo= 1;
		
		if(num2>=0) {
			for (int i =  0;i < num2;i++) {
				calcolo = calcolo * num1;
				
			}return calcolo;
		}else {
			for(int i = 0;i > num2;i--) {
				calcolo = calcolo / num1;
			}
			
			return calcolo;
		}
		
		
	}
		
	
	
	
	
}
