import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice = 1;
		double answer = 0.0;

    System.out.print("Please enter a number: ");
    num1 = kb.nextDouble();

    System.out.print("Please enter another number: ");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {

        case 1:
          double printSum = findSum(num1,num2);
          System.out.println("The sum of " + num1 + " and " + num2 + " is " + printSum + ".");
          break;

        case 2:
          double printAverage = findAverage(num1,num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is " + printAverage + ".");
          break;

        case 3:
        double printTax = calcTax(num1,num2);
        System.out.println("The tax on " + num1 + " and " + num2 + " is " + printTax + ".");
        break;

        case 4:
          keepGoing = false;
          System.out.println("Goodbye!");
          break;

        default:
          System.out.println("Invalid Entry. Please try again.");
          break;
		      }
        }

    kb.close();

  }

  public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	     }

  public static double findSum(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	     }

  public static double findAverage(double num1, double num2) {
		double average = (num1 + num2)/2;
		return average;
	     }

  public static double calcTax(double num1, double num2) {
		double tax = (num1 + num2) * .0831;
		return tax;
      }

}
