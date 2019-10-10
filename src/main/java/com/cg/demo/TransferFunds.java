package com.cg.demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TransferFunds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger recAccNum;
		double amount;
		double balanceInAcc = 10500.50;
		
		boolean val=false;
		String transacPass;
		System.out.println("Enter reciepient's account number");
		recAccNum = scanner.nextBigInteger();
		do{
		System.out.println("Enter amount to be trasferred");
		amount = scanner.nextDouble();
		
		System.out.println("Enter transaction password");
		transacPass = scanner.next();
		
		if(amount<= balanceInAcc) {
			System.out.println("Transaction done Succesfully !!");
			balanceInAcc = balanceInAcc - amount;
			System.out.println("Updated balance in my account : "+ balanceInAcc);
		
		}
		else {
			System.out.println("Insufficient Funds !! Go back Again.");
			val=true;
		}
		}while(val==true);
		
	}

}
