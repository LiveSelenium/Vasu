package oops;

public class B extends A
{
	public void classB()
	{
		System.out.println("ClassB Executed");
	}

	public static void main(String[] args)
	{
		B v=new B();
		v.classB();
		v.classA();

	}

}
