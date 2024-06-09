//if statement
//conditional statement is something ,on the basis of the evaluation done as true or false the 
//code is executed such as for true it will execute something and if false it will execute 
//something
/*
 syntax:
	if(<boolean expression>)
	{
		//execute this when true
	}
	else
	{
		//execute this when false
	}
	
Realtional operator::

	== 	is equal to
	!= 	is not equal to
	> 	greater than
	< 	less than
	>= 	greater than equals to
	<= 	less than equals to
*/
package Java.demo;

public class ConditionalOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		if(a==b)
		{
			System.out.println("a's value is same as b's");
		}
		else
		{
			System.out.println("a and b do not match");
		}
	}

}
