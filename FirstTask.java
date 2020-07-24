 class Test {
	int f;
	int s;
	Test(int f,int s)
	{
		this.f=f;
		this.s=s;
	}
	public  int printLargest()
	{
		if(this.f<this.s)
			return this.s;
		else
			return this.f;
	}
}
public class FirstTask
{
	
public static void main(String args[])
{
	Test t=new Test(100,200);
	System.out.println(t.printLargest()+" is greatest among the two numbers ");
}

}
