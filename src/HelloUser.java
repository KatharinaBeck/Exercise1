import java.util.Scanner;

public class HelloUser {
	
	private static String userName;

	public static void greetUser(){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Please enter your name: ");

		userName = stdIn.nextLine();
	    System.out.println("Hello " + userName + "!");
	}

}
