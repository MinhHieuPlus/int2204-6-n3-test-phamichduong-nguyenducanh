package junit.edu.models;

import java.util.Scanner;

public class DemojUnit {
	public static int maxOfTwoNumberInterger(int a,int b) {
		return Math.max(a, b);
	}
	public static int elementMinOfArray(int[] arr) {
		int min= arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static String BMI(double weight,double height) {
		double bmi = weight/(height*height);
		String s ="";
		if(bmi < 18.5) s = "Thiếu cân";
		else if(bmi>=18.5 && bmi<23)  s = "Bình thường";
		else if(bmi>=23 && bmi <25) s = "Thừa cân";
		else if(bmi>=25) s = "Béo vl";
		return s;
	}
	
}
