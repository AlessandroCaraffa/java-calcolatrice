package org.generation.italy.utils;

public class CalcoliHelper {
	
	
	public static int somma (int num1,int num2) {
		return num1 + num2;
	}
	public static double somma (double num1,double num2) {
		return num1 + num2;
	}
	
	public static int diff (int num1,int num2) {
		return num1 - num2;
	}
	public static double diff (double num1,double num2) {
		return num1 - num2;
	}
	
	
	public static int per (int num1,int num2) {
		return num1 * num2;
	}
	public static double per (double num1,double num2) {
		return num1 * num2;
	}
	
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
	
	
	
}
