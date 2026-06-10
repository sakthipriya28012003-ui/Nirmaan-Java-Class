package bank;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Bill=0;
		System.out.println("enter 1 for house bill:");
		System.out.println("enter 2 for government bill:");
		System.out.println("enter 3 for commerical bill:");
		System.out.println("enter 4 for office bill:");
        int option;
        int unit=0;
        option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("enter  house unit:");
			 unit=sc.nextInt();
			Bill=unit*5;
			System.out.println("bill value:"+Bill);
			break;
		case 2:
			System.out.println("enter the commerical unit:");
			 unit=sc.nextInt();
			Bill=unit*7;
			System.out.print("bill value:"+Bill);
			break;
		case 3:
			System.out.println("enter the government unit:");
			 unit=sc.nextInt();
			Bill=unit*9;
			System.out.println("bill value:"+Bill);
			break;
		case 4:
			System.out.println("enter the office bill:");
			unit=sc.nextInt();
			Bill=unit*9;
			System.out.println("bill value:"+Bill);
			break;
		case 5:
			System.out.println("Exit");
			break;
			
			default:
				System.out.println("Thankyou");
			
			
			
		}

	}

}
