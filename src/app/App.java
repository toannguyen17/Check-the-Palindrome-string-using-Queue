package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string Palindrome:");
		String string = scanner.nextLine();

		MyStack stack = new MyStack(string.length());
		MyQueue queue = new MyQueue(string.length());

		for (int i = 0; i < string.length(); i++){
			String stringItem = String.valueOf(string.charAt(i));
			stack.push(stringItem);
			queue.enqueue(stringItem);
		}

		boolean isPalindrome = true;
		for (int i = 0; i < string.length(); i++){
			String stackItem = stack.pop();
			String queueItem = queue.dequeue();
			if(!stackItem.equals(queueItem)){
				isPalindrome = false;
			}
		}
		if (isPalindrome){
			System.out.println("\"" + string +"\" is Palindrome.");
		}else{
			System.out.println("\"" + string +"\" not Palindrome.");
		}
	}
}
