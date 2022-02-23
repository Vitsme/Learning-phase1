//Learning access Modifiers

//package
package package1;
//base class
public class MyPackage1BaseClass 
{
	//variables
public int a;
private int b;
protected int c;
int d;
//method
public void myPackage1BaseClassMethod()
{
	// i am not getting error all these variables present in public private protected default
	a=5;
	b=10;
	c=11;
	d=12;
}
}
//Derived class (for derived class we need to use the extend of the base class)
class MyPackage1DerivedClass extends MyPackage1BaseClass
{
	//method
	public void myPackage1DerivedClassMethod()
	{
		//Getting error on private
		a=5;
		b=10;
		c=11;
		d=12;
		
	}
}
//other class (in real world classes are in separate file)
class MyPackage1OtherClass
{
	//method
	public void myPackage1OtherClassMethod()
	{
		//need to create a object from the base class to introduce to the other class
		MyPackage1BaseClass obj = new MyPackage1BaseClass();
		obj.a=10;
		obj.b=11;
		obj.c=12;
		obj.d=13;
		// In other class we cannot access private  we are getting error
		
	}
}