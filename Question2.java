import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your weight in kilograms: ");
    double height = in.nextDouble();

    System.out.println("Enter your height in meters: ");
    double weight = in.nextDouble();

    double bmi = height / (weight * weight);
    String output = String.format("Your BMI is %.1f", bmi);
    System.out.println(output);
  }
}
