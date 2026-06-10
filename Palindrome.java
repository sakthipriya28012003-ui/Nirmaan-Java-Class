package bank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int original=n;
int rev=0;

while(n !=0) {
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
    System.out.println("Reverse a number:"+rev);
if(original == rev) {
	System.out.println("It is a palindrome");
}
else {
	System.out.println("It is a not palindrome");
}


	}

}
