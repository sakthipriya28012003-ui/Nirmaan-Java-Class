package bank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("menu");
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.balance");
		System.out.println("4.exit");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int amount =50000;
		int balance =amount;
		
		switch(n) {
		case 1:
			System.out.println("deposit");
			System.out.println("enter a deposit amount");
			if (amount>0) {
				balance=balance+amount;
				System.out.println("deposit:"+balance);
			}
			else {
				System.out.println("invalid amount");		
			}
			break;
			
		case 2:
			System.out.println("withdraw");
			System.out.println("Enter withdraw amount:");
			amount=sc.nextInt();
			if(amount<=balance) {
				balance=balance-amount;
				System.out.println("withdraw amount:"+balance);
			}
			else {
				System.out.println("insufficient balance");
			}
			break;
		case 3:
			System.out.println("check balance");
			System.out.println("balance amount:"+balance);
			break;
			
		case 4:
			System.out.println("exit");
			break;
			
			default:
				System.out.println("invalid choice");
			
		}
		
		
	}

}
