package corejava;

interface MyInterface
{
   public void doSomething();
}
class MyClass implements MyInterface
{
  	public void doSomething()
  	{
  		System.out.println("Doing Something");
  	}
}
class Mymain
{
	public static void main(String[] args) {
   MyClass m=new MyClass();
   m.doSomething();
	}
}