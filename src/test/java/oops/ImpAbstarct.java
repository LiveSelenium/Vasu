package oops;

public class ImpAbstarct extends SamAbstraction
{

	
	public void microChip() 
	{
		System.out.println("MicroChip Executed");
		
	}

	public static void main(String[] args)
	{
		
		ImpAbstarct v=new ImpAbstarct();
		
		v.keyPad();
		v.microChip();
		
		
	}

}
