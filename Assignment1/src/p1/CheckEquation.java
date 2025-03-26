package p1;
//Name:: Asmaa Abed AL-Rahman Fares
//Section :: 9
//STD.NO :: 1210084
import java.util.Scanner;

public class CheckEquation {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Equation equation = new Equation();
			
			//This loop keeps checking for valid ids
			while(true){
				System.out.println("Please enter your id:");
				long id = input.nextLong();
				if(id == -1){
					System.out.println("Exiting the program");
					break;
				}else{
					if(equation.isBalanced(id)){
						System.out.println("Please enter your name:");
						input.nextLine();
						String name = input.nextLine();
						System.out.println("Hello " + name);
						
						//This loop keeps displaying the menu until the user exits it
						while(true){
							equation.displayMenu();
							int option = input.nextInt();
							
							//This logic is used for solving the equation using the given x value
							switch(option){
							case 1 : 
								System.out.println("Please enter the value of x:");
								equation.x = input.nextDouble();
								System.out.println("Please enter the coefficients of the equation(a,b,c)");
								equation.a = input.nextDouble();
								equation.b = input.nextDouble();
								equation.c = input.nextDouble();
								equation.solveEquation();
								break;
							case 2 :
								System.out.println("Please enter the coefficients of the equation(a,b,c)");
								equation.a = input.nextDouble();
								equation.b = input.nextDouble();
								equation.c = input.nextDouble();
								equation.findEquationRoots();
								break;
							case 3 :
								System.out.println("Please enter the coefficients of the equation(a,b,c)");
								equation.a = input.nextDouble();
								equation.b = input.nextDouble();
								equation.c = input.nextDouble();
								System.out.println("Please enter the coefficients of the second equation(a,b,c)");
								equation.a = input.nextDouble();
								equation.b = input.nextDouble();
								equation.c = input.nextDouble();
								equation.combineEquations();
								break;
							case 4 :
								System.out.println("Exiting the menu");
								break;
							default :
								System.out.println("Invalid option");
								break;
							}
						}
					}else{
						System.out.println("The given id is not balanced. Please enter a balanced id ::");
					}}}}}



