package java8features;

//block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString reversestr=(str) -> {
			String result="";
			
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reversestr.myStringFunction("Sai Kiran"));
		System.out.println(reversestr.myStringFunction("Java"));
		
		
		//lambda expression with single parameter
		
         MyString myName=(name) -> { return "Hello "+name;};
         
         System.out.println(myName.myStringFunction("Kiran"));
         
         //lambda expression with single parameter with no parenthesis
         
         MyString myname1=name -> { return "Hello "+name;};
         
         System.out.println(myname1.myStringFunction("Kumpatla"));
	}
}

