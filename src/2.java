import java.util.Scanner;
public class Project {
	public static void main(String[] args) {
		// Get the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		// Display the output
		System.out.println("Hello, " + name + "!");
	}
}