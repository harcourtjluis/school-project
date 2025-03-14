import java.util.Scanner;
public class RandomNumber{
    public static void main(String[] args){
        System.out.println("Please enter a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            int randomNumber = (int)(Math.random()*num+1);
            System.out.println("Your number is: " + randomNumber);
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}