package java8features;

//Method Reference -Short hand of lambda expression to call methos

@FunctionalInterface
interface MyInterface
{
    void myMethod();
}
class Test // instance class
{
        void display() // instance method
        {
            System.out.println("Iam a Instance Method");
        }
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
		//traditional approach
		Test t1=new Test();
		t1.display();
		
		//Java8 Method reference approach
		MyInterface m1ref=t1::display;
		
		//calling method of FI
		m1ref.myMethod();

		//Lambda -->FI
		//MR -->Shorthand of lambda
		//MR -->FI
	}
	

}
