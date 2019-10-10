package com.cg.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ServiceProviders {

	public static void main(String[] args) {
		
		System.out.println("********WELCOME*********");
		System.out.println("Select your choice 1/2/3/4/5 :");
		System.out.println("1.Electricity");
		System.out.println("2.BroadBand");
		System.out.println("3.landline");
		System.out.println("4.Gas");
		System.out.println("5.DishSubscription");
		
		Scanner scanner = new Scanner(System.in);
		boolean val=false;
		do {
			int choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println("Pay your electricity bill");
				payBill();
				break;
		
			case 2:
				System.out.println("Pay your wifi bill");
				payBill();
				break;
			
			case 3:
				System.out.println("Pay your landline bill");
				payBill();
				break;
			
			case 4:
				System.out.println("Pay your gas bill");
				payBill();
				break;
			
			case 5:
				System.out.println("Pay your dish bill");
				payBill();
				break;
			
			default:
				System.out.println("Enter correct choice");
				break;
			}
			val = true;
		} while(val==true);
	}
		public static void payBill() {

			double amount;
			double balanceInAcc = 10500.50;
			String transacPass;
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter amount to be trasferred");
			amount = scanner.nextDouble();

			System.out.println("Enter transaction password");
			transacPass = scanner.next();

			if (amount <= balanceInAcc) {
				System.out.println("Transaction done Succesfully !!");
				balanceInAcc = balanceInAcc - amount;
				System.out.println("Updated balance in my account : " + balanceInAcc);

			}
			else {
				System.out.println("Insufficient Funds !! Go back Again.");
			}
		}
	}
