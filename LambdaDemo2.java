package java8features;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
	NumericTest isEven=(n) -> (n%2==0);  //stored in the instance of FI
	NumericTest isNegative=(n) -> (n<0);
	
	System.out.println("6 is a Even Number"+isEven.computeTest(6));
	System.out.println("55 is a Negative Number"+isNegative.computeTest(55));
	
	//boolean a=(n) -> (n%2==0); //error-lambda expressions should be stored in instance of FI
	
		

	}

}
