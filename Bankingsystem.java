package bank;
import java.util.*;
public class Bankingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String username="sakthi";
		String password="priya@28";
		double balance=200000;
		
	
		System.out.println("Enter username:");
		String u=sc.next();
		
		System.out.println("Enter a password:");
		String p=sc.next();
		
		if(u.equals(username) && p.equals(password)) {
			System.out.println("Login successful");
			
			int choice;
			do {
				System.out.println("\n1.Depoist 2.Withdraw 3.Balance 4.Exit");
				choice=sc.nextInt();
				
				switch(choice){
					case 1:
					System.out.println("Amount:");
					balance +=sc.nextDouble();
					break;
					
					case 2:
					System.out.println("Amount:");
					double amt=sc.nextDouble();
					
					if (amt<=balance)
						balance -=amt;
					else
						System.out.println("Insufficient Balance");
					break;
					
					case 3:
					    System.out.println("Balance:" + balance);
					break;
					
					case 4:
						System.out.println("Thankyou");
						break;
						
						default:
							System.out.println("Invaild choice");
			
						}
			}while(choice !=4);
		}else {
			System.out.println("Invaild Login!");
		}
		sc.close();
		
	}
}
			
				

	


