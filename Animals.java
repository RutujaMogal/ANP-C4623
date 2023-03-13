package corejava;

interface Animals
{
  public void sound();//interface method without body
}

class Monkey implements Animals//creating a class monkey
{
	public void sound()//body of interface method sounds
	{
		System.out.println("ooooo aaaa");
	}
}
class Main
{
 public static void	main(String[] args)
 {
	 Monkey mk=new Monkey();// Creating object of class Monkey
	 mk.sound();//calling a method
 }
}