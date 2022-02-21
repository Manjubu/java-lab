package com.Exception;
import java.util.Scanner;
public class AgeValidate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if(age<=15) {
			System.out.println("Invalid");
		}
		else {
			try {
		
			
				throw new AgeInvalidException();
			}
		catch(AgeInvalidException e) {
			System.out.println("Valid");
		}
}
}
}