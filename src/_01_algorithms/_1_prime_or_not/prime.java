package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	// if a number that the user gives is prime, then show a message that it is prime
	public static void main(String[] args) {
	// get a number from the user
		int n = Integer.parseInt(JOptionPane.showInputDialog("Input a number:"));
		
	// check if n is prime
	// 5: is divisible by 1 and 5, exclude 1 and itself
	// 7: check if it's divisible by 2,3,4,5,6
	// 12: check if it's divisible by 2,3,4,5,6,7,8,9,10,11
		
	String result = "is prime";
	
	for(int i = 2;i <= n-1; i++) {
		if(n % i == 0) {
			result = "is not prime";
		}
	}
	
	JOptionPane.showMessageDialog(null, n + result);
	}
}