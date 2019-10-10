package com.cg.demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger recAccNum;
		double amount;
		double balanceInAcc = 10500.50;
		double balanceinRecAcc = 4300.00;
		String transacPass;
		System.out.println("Enter reciepient's account number");
		recAccNum = scanner.nextBigInteger();
		
		System.out.println("Enter amount to be trasferred");
		amount = scanner.nextDouble();
		
		System.out.println("Enter transaction password");
		transacPass = scanner.next();
		boolean check = false;
		while(amount<= balanceInAcc) {
			System.out.println("Transaction done Succesfully !!");
			balanceinRecAcc = balanceinRecAcc + amount;
			System.out.println("Final balance in reciepient's account : "+ balanceinRecAcc);
			check = true;
			break;
		}
		if(check = false ) {
			System.out.println("Enter correct amount");
		}
		else {
			System.out.println("***********END************");
		}
	    
	
		
		

	}

}
