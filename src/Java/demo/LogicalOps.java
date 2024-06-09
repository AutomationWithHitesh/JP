
//to evalutae more than one condition using single if statement then to do that 
//we use logial operators
/*
Logical operators:
&&		AND
||		OR  
*/

package Java.demo;

public class LogicalOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark2= 35;
		int mark1= 45;
		if (mark1>=35 || mark2<=45)
		{
			System.out.println("if executed");
		}
		else
		{
			System.out.println("else executed");
		}
	}

}
