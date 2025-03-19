import java.util.*; 
public class School_project { 
  public static void main(String[] args) { 
    System.out.println("Welcome to our school project"); 
    String[] classmates = {"Jhon", "Mary", "David"}; 
    for (int i = 0; i < classmates.length; i++) { 
      System.out.println(classmates[i]); 
    } 
    Scanner input = new Scanner(System.in); 
    String name = input.nextLine(); 
    if (name == "John") { 
      System.out.println("Hello, John!"); 
    } else if (name == "Mary") { 
      System.out.println("Hello, Mary!"); 
    } else if (name == "David") { 
      System.out.println("Hello, David!"); 
    } else { 
      System.out.println("I don't know you."); 
    } 
  } 
}