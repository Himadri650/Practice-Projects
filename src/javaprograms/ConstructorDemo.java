package javaprograms;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("This is defult Constructor");
	}
	public ConstructorDemo(int a)
	{
		System.out.println("This program is parametrized constructor");
		System.out.println("The value of variable a is :" + a);
	}
	
	public ConstructorDemo(int a, int b)
	{
		System.out.println("This program is parametrized constructor");
		System.out.println("The value of variable a is :" + a);
		System.out.println("The value of variable a is :" + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ConstructorDemo obj = new ConstructorDemo();
	ConstructorDemo obj2 = new ConstructorDemo(10);
	ConstructorDemo obj3 = new ConstructorDemo(10,20);

		
	}

}
