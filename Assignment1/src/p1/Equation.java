
package p1;
//Name:: Asmaa Abed AL-Rahman Fares
//Section :: 9
//STD.NO :: 1210084

import java.util.Scanner;

public class Equation {

	Scanner input = new Scanner(System.in);
	double a;
	double b;
	double c;
	double x;
	double root1;
	double root2;

	// to check if the given id is balanced or not
	public boolean isBalanced(long iD) {
		long temp = iD;
		long oddSum = 0;
		long evenSum = 0;
		int i = 1;

		// to calculate the odd sum and even sum of the digits in the id
		while (temp != 0) {
			if (i % 2 == 0) {
				evenSum += temp % 10;
			} else {
				oddSum += temp % 10;
			}
			temp = temp / 10;
			i++;
		}
		if (oddSum == evenSum) {
			return true;
		} else {
			return false;
		}
	}

	// to calculate the roots of the quadratic equation
	public void findEquationRoots() {
		double sqrtPart = Math.pow(b, 2) - 4 * a * c;

		// checks if the given equation has imaginary roots or not
		if (sqrtPart < 0) {
			System.out.println("The given equation has imaginary roots");
		} else {
			root1 = (-b + Math.sqrt(sqrtPart)) / (2 * a);
			root2 = (-b - Math.sqrt(sqrtPart)) / (2 * a);
			System.out.println("The roots of the given equation are: " + root1 + " and " + root2);
		}

	}

	//calculates the value for x in the quadratic equation
	public void solveEquation() {
		double res = a * Math.pow(x, 2) + b * x + c;
		System.out.println("The result of the equation is : " + res);
	}

	//combines two quadratic equations with the same x values
	public void combineEquations() {
		double a1 = a;
		double b1 = b;
		double c1 = c;

		a = a1 + a;
		b = b1 + b;
		c = c1 + c;
		System.out.println(
				"The equation after combining the two equations is: " + a + "x^2 + " + b + "x + " + c + " = 0");
	}

	//to displays the menu for the user
	public void displayMenu() {
		System.out.println("Menu:: ");
		System.out.println("(1) To Solve any quadratic equation by entering the value of x and the values of the coefficients (a,b,c) of the equation.");
		System.out.println("(2) To Find the root values of any given quadratic equation entered as in item 1 above (only coefficients entered and there is no x).");
		System.out.println("(3) To Combine any two quadratic equations with the same x value/s into one equation.");
		System.out.println("(4) To exit.");
	}
}
