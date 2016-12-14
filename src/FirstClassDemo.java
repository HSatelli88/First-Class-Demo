public class FirstClassDemo 
{
		int x=10;
		int y =80;
							
		public static void main(String[] args) 
		{
			foo();
			int addi=FirstClassDemo.sum(40,50); //Static so called using class name 
			FirstClassDemo obj1=new FirstClassDemo(); // non-static so created an object
			int minu=obj1.subs(50,10);
			System.out.println("Addition is :"+addi);
			System.out.println("Substraction is:"+minu);
			finalkey();
		}
		public static int sum(int a,int b) //passing Parameters 
		{
			int c=a+b;
			return c;
		}
		public int subs(int a,int b)
		{
			int d=a-b;
			return d;
		}

		private static void foo() //Private Access Specifier
		{
			for(int i=0;i<5;i++) //Loop
			{
				System.out.println(+i);
			}
		}

		final static void finalkey() //Final KeyWord
		{
			FirstClassDemo obj2=new FirstClassDemo();
			System.out.println("Value of x is"+obj2.x); //Trying to access first x&y values as i'm extending class A
			System.out.println("Value of Y is"+obj2.y);
			System.out.println("Its Final No one can Change me");
		}
}

