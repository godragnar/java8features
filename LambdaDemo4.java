package java8features;

public class LambdaDemo4 {

	public static void main(String[] args) {

		
		Addition op1=(a,b) -> (a+b);
		
		System.out.println("addition of 2 No's is :"+op1.calculate(200, 155));
		
		
		
		Addition op2=(a,b) -> (a-b);
		
		System.out.println("Subtraction of 2 No's is :"+op2.calculate(200, 155));
		
		
		Addition op3=(a,b) -> (a*b);
		
		System.out.println("Multiplication of 2 No's is :"+op3.calculate(200, 155));
		
		
		Addition op4=(a,b) -> (a/b);
		
		System.out.println("Divison of 2 No's is :"+op4.calculate(200, 155));
		
		
		
	}

}
