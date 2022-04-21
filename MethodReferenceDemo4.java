package java8features;

interface IMessage
{
	ConstructorRefernce getMessage(String msg);
}
class ConstructorRefernce
{
	public ConstructorRefernce(String msg) {
		
		System.out.println(msg);
	}
}

public class MethodReferenceDemo4 {

	public static void main(String[] args) {
		
	IMessage hello=ConstructorRefernce::new;
	hello.getMessage("Method Refernce to constructor");
		
	}

}
