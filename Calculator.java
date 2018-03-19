import java.util.Scanner;
import java.util.*;

//Addition calculations
class Add {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number:");
		double num1 = input.nextDouble();

		System.out.println("Input second number:");
		double num2 = input.nextDouble();

		double num3 = num1 + num2;

		System.out.println(num1 + "+" + num2 + "=" + num3);
	}
}

//Subtraction calculations
class Subtract {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number:");
		double num1 = input.nextDouble();

		System.out.println("Input second number:");
		double num2 = input.nextDouble();

		double num3 = num1 - num2;

		System.out.println(num1 + "-" + num2 + "=" + num3);
	}
}

//Multiplication calculations
class Multiply {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input first number:");
		double num1 = input.nextDouble();

		System.out.println("Input second number:");
		double num2 = input.nextDouble();

		double num3 = num1 * num2;

		System.out.println(num1 + "*" + num2 + "=" + num3);
	}
}

//Division calculations
class Divide {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first number:");
		double num1 = input.nextDouble();

		System.out.println("Input second number:");
		double num2 = input.nextDouble();

		double num3 = num1 / num2;

		if (num3 > 0) {
			System.out.println(num1 + "/" + num2 + "=" + num3);
		} else {
			System.out.println("Error! result is less than zero or zero. Code failure");
		}
	}
}

//Square root calculations
class Root {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input number to be rooted:");
		double num1 = input.nextDouble();

		double root = Math.sqrt(num1);

		System.out.println("The square root of " + num1 + " is: " + root);
	}
}

//Squaring numbers
class Square {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input number to be squared:");
		double num1 = input.nextDouble();

		double sqr = num1 * num1;

		System.out.println("(" + num1 + ")^2=" + sqr);
	}
}

//Find roots of a quadratic
class Quadratics{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 'a'");
		double a = input.nextDouble();
		System.out.println("Input 'b'");
		double b = input.nextDouble();
		System.out.println("Input 'c'");
		double c = input.nextDouble();
		
		double result = b * b - 4.0 * a * c;
		
		if (result >0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2 );
		}
		else if (result == 0.0){
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
	}
}

//ID value of (i)^x
class Imaginary{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input intiger value of i's exponent");
		int num1 = input.nextInt();

		if ((num1 % 4) == 1)
		{
			System.out.println("Answer is i or root(-1). Equivenent to i^1");
		}
		
		else if ((num1 % 4) == 2)
		{
			System.out.println("Answer is -1. Equivelent to i^2");
		}
		
		else if ((num1 % 4) == 3)
		{
			System.out.println("Answer is -i. Equivelent to i^3");
		}

		else if ((num1 % 4) == 0)
		{
			System.out.println("Answer is 1. Equivelent to i^4");
		}

		else
		{
			System.out.println("Error. Please try again.");
		}
	}
}

//Find absolute value
class Absolute {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input number for absolute value calculation:");
		double num1 = input.nextDouble();

		double abs = Math.abs(num1);

		System.out.println("|" + num1 + "|=" + abs);
	}
}

//Raise a number to a power
class Exponent {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input base number:");
		double num1 = input.nextDouble();

		System.out.println("Input exponent number:");
		double num2 = input.nextDouble();

		double num3 = Math.pow(num1, num2);

		System.out.println(num1 + "^" + num2 + "=" + num3);
	}
}

//Find area and perimiter of a circle
class Circle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input radius:");
		double radius = input.nextDouble();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}
}

//Find surface area and volume of a cube
class Cube {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input side length:");
		double s = input.nextDouble();

		double vol = s * s * s;
		
		double sur = s * s * 6;

		System.out.println("Volume of cube is: " + vol);
		System.out.println("Survace area of cube is: " + sur);
	}
}

//Find cube root of a number
class CubeRoot {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input number:");
		double num1 = input.nextDouble();

		double cbrt = Math.cbrt(num1);

		System.out.println("The cube root of " + num1 + " is: " + cbrt);
	}
}

/*Synthetic division calculator.
Returns new coefficients after original coefficeint input and factor value.
Remainder return in development. Inaccurate remainder results are posible.
*/
class Synth {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input factor value:");
		double f1 = input.nextDouble();

		System.out.println("Input number of coefficients (3-8):");
		int coef = input.nextInt();
		
		//Find number of coefficients to determine setup for synthetic division
		if (coef == 3){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double r1 = c3+p2;
			double a1 = c1;
			double a2 = c2+p1;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x+"+a2+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x+"+a2+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else if (coef == 4){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double r1 = c4+p3;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^2+"+a2+"x+"+a3+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^2+"+a2+"x+"+a3+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else if (coef == 5){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double r1 = c5+p4;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^3+"+a2+"x^2+"+a3+"x+"+a4+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^3+"+a2+"x^2+"+a3+"x+"+a4+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else if (coef == 6){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double r1 = c6+p5;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^4+"+a2+"x^3+"+a3+"x^2+"+a4+"x+"+a5+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^4+"+a2+"x^3+"+a3+"x^2+"+a4+"x+"+a5+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else if (coef == 7){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			System.out.println("Enter seventh coefficient:");
			double c7 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double r1 = (c7+p6);
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^5+"+a2+"x^4+"+a3+"x^3+"+a4+"x^2+"+a5+"x+"+a6+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^5+"+a2+"x^4+"+a3+"x^3+"+a4+"x^2+"+a5+"x+"+a6+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else if (coef == 8){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			System.out.println("Enter seventh coefficient:");
			double c7 = input.nextDouble();

			System.out.println("Enter eighth coeffecient:");
			double c8 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double p7 = (c7+p6)*f1;
			double r1 = (c8+p7);
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;
			double a7 = c7+p6;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6+"; "+a7);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^6+"+a2+"x^5+"+a3+"x^4+"+a4+"x^3+"+a5+"x^2+"+a6+"x+"+a7+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^6+"+a2+"x^5+"+a3+"x^4+"+a4+"x^3+"+a5+"x^2+"+a6+"x+"+a7+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else{
			System.out.println("Error. Please input a value 3-8.");
		}
	}
}

class NaturalLog {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Imput number:");
		double num1 = input.nextDouble();

		double log = Math.log(num1);

		System.out.println("ln("+num1+")="+log);
	}
}

class PERT {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input P: ");
		double p = input.nextDouble();
		
		System.out.print("Input r (enter in decimal format): ");
		double r = input.nextDouble();

		System.out.print("Input t: ");
		double t1 = input.nextDouble();

		double exp1 = r*t1;
		double e2 = Math.exp(exp1);
		double a1 = p*e2;

		System.out.println("A=Pe^(rt) A="+a1);
	}
}





/* Code created by Zachary Showgren.
Calculator.java is free to use.
Please leave any feedback on its proformance and/or edits you found helpful on my GitHub: ShowgrenZ
*/
