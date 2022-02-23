package package2;

//It will import on right click if we added it on the extends in public class
import package1.MyPackage1BaseClass;
//derived class
public class MyPackage2DerivedClass extends MyPackage1BaseClass
{
	//Other Package Derived class
public void myPackage2DerivedClass()
{
	//InOther package  i can't access private and default
	a=5;
	b=10;
	c=11;
	d=12;
	
}
}
//other class
class MyPackage2OtherClass
{
	//other package other class 
	public void myPackage2OtherClass()
	{
		//For other class we need to create obj
		MyPackage1BaseClass obj=new MyPackage1BaseClass();
		obj.a=10;
		obj.b=11;
		obj.c=12;
		obj.d=13;
		// i can access only public		
	}
}
