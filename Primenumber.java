package bank;

import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc
		function PrimeSum(n) {
		    let sum = 0;

		    for (let i = 2; i <= n; i++) {
		        let flag = 1;
		        for (let j = 2; j <= i / 2; j++) {
		            if (i % j == 0) {
		                flag = 0;
		                break;
		            }
		        }

		        if (flag) {
		            sum += i;
		        }
		    }

		    return sum;
		

		let n = 10;
		let result = primeSum(n);
		console.log(result);

	}

