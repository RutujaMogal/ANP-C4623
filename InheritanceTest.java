
class Animal
{
 // method

  public void display()
  {
     System.out.println("Inside Parent Class");
  }
}
//child class
class Dog extends Animal
{
public void sound()
{
  System.out.println("Barks...");
}
}
//child class as a parent class
class Puppy extends Dog
{
 public void cute()
{
 System.out.println("the puppy is cute");
}
}


class InheritanceTest 
{
  public static void main(String[] args)
  {
// creating an object of child class
    Puppy a=new Puppy();
    a.display();
    a.sound();
    a.cute();
  }

}
