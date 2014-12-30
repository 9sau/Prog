import java.util.Scanner;


public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call myGradeBook's displayMessage method
		
		Scanner input = new Scanner( System.in );
		
		 // obtain user input
		 System.out.print(
		 "Enter three floating-point values separated by spaces: " );
		double number1 = input.nextDouble(); // read first double
		 double number2 = input.nextDouble(); // read second double
		  double number3 = input.nextDouble(); 
		  System.out.println(number1);
		  System.out.println(number2);
		  System.out.print(number3);
	}

}
