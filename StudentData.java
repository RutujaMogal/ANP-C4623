//create a student class with fields id,name,age, invoke getters and setters and print the output in the form:student data 
//student id:
//student name:
//student age:

class StudentInfo

{
 
   private int student_id;  
   private String student_name;
   private int student_age;
   public int getStudent_id()
   { 
       return student_id;
   }
   public void setStudent_id(int student_id)
   { 
      this.student_id=student_id;
   }
    public String getStudent_name()
   { 
       return student_name;
   }
   public void setStudent_name(String student_name)
   { 
      this.student_name=student_name;
   }
   public int getStudent_age()
   { 
       return student_age;
   }
   public void setStudent_age(int student_age)
   { 
      this.student_age=student_age;
   }

}




public class StudentData
{
   public static void main(String[] args)
   {
      // creating class of object StudentInfo
      
         StudentInfo a=new StudentInfo();
         // object is used to access the methodes of class
         a.setStudent_id(12543);
         a.setStudent_name("Rutuja");
         a.setStudent_age(22);
         System.out.println("Student Data:"+"\n"+" Student Id:"+a.getStudent_id()+"\n"+"Student Name:"+a.getStudent_name()+"\n"+"Student age:"+a.getStudent_age()); 
   }  
}
