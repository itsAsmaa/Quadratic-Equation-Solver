# Quadratic Equation Solver 

## Project Overview

This Java project allows users to perform operations related to quadratic equations and validate ID numbers based on a balance check. The user can solve quadratic equations, find their roots, and combine two quadratic equations with the same `x` values into one. Additionally, the program verifies if a provided ID number is balanced.

The project is composed of two Java classes:

- **CheckEquation.java**: This file contains the main program logic, handling user input, displaying the menu, and processing user selections.
- **Equation.java**: This file contains methods for solving quadratic equations, finding their roots, and checking if an ID is balanced.

## Features

1. **ID Balance Check**:
   - Verifies if a given ID number is balanced. The balance check is based on whether the sum of the digits in odd positions is equal to the sum of the digits in even positions.

2. **Quadratic Equation Operations**:
   - **Solve Equation**: Given the coefficients (a, b, c) of a quadratic equation and a value for `x`, the program calculates and displays the result.
   - **Find Roots**: Given the coefficients of a quadratic equation, the program calculates and displays its roots if they exist. If the discriminant is negative, it reports that the equation has imaginary roots.
   - **Combine Equations**: Combines two quadratic equations by summing their respective coefficients and displays the resulting equation.

## Project Files

### 1. `CheckEquation.java`

This is the main class where the user interface resides. The program prompts the user to enter their ID, checks if it is balanced, and then displays a menu for solving equations, finding roots, and combining equations.

Key Methods:
- `main()`: Handles user input and invokes operations based on user selections.
- Calls methods from `Equation.java` to perform calculations.

### 2. `Equation.java`

This class contains the logic for solving quadratic equations, finding their roots, and checking the balance of an ID number.

Key Methods:
- `isBalanced(long iD)`: Checks if the given ID number is balanced.
- `findEquationRoots()`: Calculates and displays the roots of a quadratic equation.
- `solveEquation()`: Solves a quadratic equation for a given `x` value.
- `combineEquations()`: Combines two quadratic equations into one by summing their coefficients.
- `displayMenu()`: Displays the menu of available operations for the user to choose from.

## How to Use

1. **Run the program**: Execute the `CheckEquation.java` file. The program will prompt you to enter your ID.
2. **ID Validation**: The program will validate if your ID is balanced.
3. **Menu Options**:
   - Select option **1** to solve a quadratic equation by entering the value of `x` and the coefficients `a`, `b`, and `c`.
   - Select option **2** to find the roots of a quadratic equation by entering the coefficients `a`, `b`, and `c`.
   - Select option **3** to combine two quadratic equations by entering the coefficients for both equations.
   - Select option **4** to exit the program.

## Example

### Sample Interaction

