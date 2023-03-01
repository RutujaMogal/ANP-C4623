

class EncapsulationExample

{
 
   private int id;  
   private String name;
   public int getId()
   { 
       return id;
   }
   public void setId(int id)
   { 
      this.id=id;
   }
    public String getName()
   { 
       return name;
   }
   public void setName(String name)
   { 
      this.name=name;
   }

}




public class TestEncapsulation
{
   public static void main(String[] args)
   {
      // creating class of object EncapsulatioExample
      
         EncapsulationExample a=new EncapsulationExample();
         // object is used to access the methodes of class
         a.setId(1);
         a.setName("Rutuja");
         System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()); 
   }  
}

