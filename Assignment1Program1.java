import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
      System.out.print(" PLease enter 5 characters: ");
      String input = scanner.nextLine();
      String processedString = reverseAndTrim(input);

    System.out.print("Enter number in Farenheit: ");
      double fahrenheit = scanner.nextDouble();
      double celsius = fahrenheitToCelsius(fahrenheit);

      scanner.nextLine();
      
      Random random = new Random();
        int min = 32;
        int max = 16384;
        int randomNumber = random.nextInt(max - min + 1) + min;
    
        String results = processedString + " " + celsius + " " + randomNumber;
        System.out.println("Combined results: " + results);

      scanner.close();
  }

  public static void printintials() {

  

    //First intial B
    System.out.println("BBBBB");
      System.out.println(" B  B");
      System.out.println(" B  B B");

    System.out.println("BBBBB");
      System.out.println(" B B. ");
    System.out.println("B  B B");

    System.out.println("  B. BB ");
    System.out.println("B B  BB");
    System.out.println("B B BB ");
    System.out.println("  BBBB BBBBBB");
    
    System.out.println();
}
  public static String reverseAndTrim(String input){
    if (input.length()!=5){
      return " Invalid input: String must be exactly 5 characters long.";
    }

    String trimmed = input.substring(1,4);
    return new StringBuilder(trimmed).reverse().toString();
  }


  public static double fahrenheitToCelsius(double fahrenheit){
    return (fahrenheit - 32) * 5.0 / 9.0;
  }
}
